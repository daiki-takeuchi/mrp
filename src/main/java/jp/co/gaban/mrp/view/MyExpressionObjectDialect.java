package jp.co.gaban.mrp.view;

import org.thymeleaf.dialect.IExpressionObjectDialect;
import org.thymeleaf.expression.IExpressionObjectFactory;

/**
 * Created by DaikiTakeuchi on 2019/02/11.
 */
public class MyExpressionObjectDialect implements IExpressionObjectDialect {

    private MyExpressionObjectFactory myExpressionObjectFactory;

    public MyExpressionObjectDialect(MyExpressionObjectFactory myExpressionObjectFactory) {
        this.myExpressionObjectFactory = myExpressionObjectFactory;
    }

    @Override
    public IExpressionObjectFactory getExpressionObjectFactory() {
        return myExpressionObjectFactory;
    }

    @Override
    public String getName() {
        return "MyExpressionObjectFactory";
    }
}
