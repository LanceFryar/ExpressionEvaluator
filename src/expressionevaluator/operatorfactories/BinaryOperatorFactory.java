package expressionevaluator.operatorfactories;

import expressionevaluator.operators.BinaryOperator;
import java.util.HashMap;
import java.util.Map;

public class BinaryOperatorFactory {
    private final Map<String, BinaryOperator> builders;
    
    public BinaryOperatorFactory() {
        builders = new HashMap<>();
        initBuilders();
    }

    private void initBuilders() {  
        initAdditionOperators();
        initSubstractOperators();
        initDivisionOperators();
        initMultiplicationOperators();
    }
    
    private void initAdditionOperators(){
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
    
    private void initSubstractOperators() {
        builders.put("IntegerIntegerSubstract", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Integer) left - (Integer) right;
            }
        });        
        builders.put("DoubleIntegerSubstract", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Double) left - (Integer) right;
            }
        });
        builders.put("IntegerDoubleSubstract", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Integer) left - (Double) right;
            }
        });
        builders.put("DoubleDoubleSubstract", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Double) left - (Double) right;
            }
        });
    }

    private void initDivisionOperators() {
        builders.put("IntegerIntegerDivision", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Integer) left / (Integer) right;
            }
        });
        builders.put("DoubleIntegerDivision", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Double) left / (Integer) right;
            }
        });
        builders.put("IntegerDoubleDivision", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Integer) left / (Double) right;
            }
        });
        builders.put("DoubleDoubleDivision", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Double) left / (Double) right;
            }
        });
    }

    private void initMultiplicationOperators() {
        builders.put("IntegerIntegerMultiplication", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Integer) left * (Integer) right;
            }
        });
        builders.put("DoubleIntegerMultiplication", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Double) left * (Integer) right;
            }
        });
        builders.put("IntegerDoubleMultiplication", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Integer) left * (Double) right;
            }
        });
        builders.put("DoubleDoubleMultiplication", new BinaryOperator() {

            @Override
            public Object evaluate(Object left, Object right) {
                return (Double) left * (Double) right;
            }
        });
    }
    
    public BinaryOperator buildAdditionOperator(Object leftValue, Object rightValue) {
        return builders.get(getSignature(leftValue, rightValue) + "Add");
    }
    
    public BinaryOperator buildSubstractOperator(Object leftValue, Object rightValue) {
        return builders.get(getSignature(leftValue, rightValue) + "Substract");
    }
    
    public BinaryOperator buildMultiplictionOperator(Object leftValue, Object rightValue) {
        return builders.get(getSignature(leftValue, rightValue) + "Multiplication");
    }
    
    public BinaryOperator buildDivisionOperator(Object leftValue, Object rightValue) {
        return builders.get(getSignature(leftValue, rightValue) + "Division");
    }

    private String getSignature(Object leftValue, Object rightValue) {
        return leftValue.getClass().getSimpleName() 
                + rightValue.getClass().getSimpleName();
    }


    
    

}
