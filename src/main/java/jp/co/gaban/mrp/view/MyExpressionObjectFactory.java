package jp.co.gaban.mrp.view;

import jp.co.gaban.mrp.view.helper.DateHelper;
import jp.co.gaban.mrp.view.helper.StringHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.IExpressionContext;
import org.thymeleaf.expression.IExpressionObjectFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by DaikiTakeuchi on 2019/02/11.
 */
@Component
public class MyExpressionObjectFactory implements IExpressionObjectFactory {

    private static final String stringExpression = "vhs";
    private static final String dateExpression = "vhd";

    private DateHelper dateHelper;
    private StringHelper strHelper;

    public MyExpressionObjectFactory(DateHelper dateHelper, StringHelper strHelper) {
        this.dateHelper = dateHelper;
        this.strHelper = strHelper;
    }

    private static final Set<String> expressionSet = new HashSet<String>() {
        {
            add(dateExpression);
            add(stringExpression);
        }
    };

    @Override
    public Set<String> getAllExpressionObjectNames() {
        return expressionSet;
    }

    @Override
    public Object buildObject(IExpressionContext context, String expressionObjectName) {
        switch (expressionObjectName) {
            case stringExpression:
                return strHelper;
            case dateExpression:
                return dateHelper;
            default:
                return null;
        }
    }

    @Override
    public boolean isCacheable(String expressionObjectName) {
        return false;
    }
}
