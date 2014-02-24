package expressionevaluator.operators;

import expressionevaluator.operators.BinaryOperator;

public class IntegerIntegerMultiplication extends BinaryOperator {

    public IntegerIntegerMultiplication() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Integer) left * (Integer) right;
    }

}
