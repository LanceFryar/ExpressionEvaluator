package expressionevaluator.operators;

import expressionevaluator.operators.BinaryOperator;

public class IntegerIntegeDivision extends BinaryOperator {

    public IntegerIntegeDivision() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Integer) left / (Integer) right;
    }

}
