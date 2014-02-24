package expressionevaluator.operators;

import expressionevaluator.operators.BinaryOperator;

public class IntegerIntegerAdd extends BinaryOperator {

    public IntegerIntegerAdd() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Integer) left + (Integer) right;
    }

}
