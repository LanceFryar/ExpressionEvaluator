package expressionevaluator;

import java.util.HashMap;
import java.util.Map;

public class BinaryOperatorFactory {
    private Map<String, BinaryOperator> builders;
    
    public BinaryOperatorFactory() {
        builders = new HashMap<>();
        initBuilders();
    }

    private void initBuilders() {
        builders.put("IntegerIntegerAdd", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Integer) left + (Integer) right;
            }
        });
        builders.put("DoubleIntegerAdd", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Double) left + (Integer) right;
            }
        });
        builders.put("IntegerDoubleAdd", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Integer) left + (Double) right;
            }
        });
        builders.put("DoubleDoubleAdd", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Double) left + (Double) right;
            }
        });
        
    }

    public BinaryOperator buildAdditionOperator(Object leftValue, Object rightValue) {
        return builders.get(getSignature(leftValue, rightValue));
    }

    private String getSignature(Object leftValue, Object rightValue) {
        return leftValue.getClass().getSimpleName() 
                + rightValue.getClass().getSimpleName() + "Add";
    }

}
