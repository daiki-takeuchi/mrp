package jp.co.gaban.mrp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EntityScan(basePackages = {"jp.co.gaban.mrp.domain"})
@EnableJpaRepositories(basePackages = {"jp.co.gaban.mrp.domain"})
@EnableTransactionManagement(proxyTargetClass = true)
public class MrpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MrpApplication.class, args);
    }

    @RequestMapping(value = "/")
    String index() {
        return "Hello World!";
    }
}
