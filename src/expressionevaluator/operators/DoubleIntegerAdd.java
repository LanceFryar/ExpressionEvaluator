package expressionevaluator.operators;

import expressionevaluator.operators.BinaryOperator;

public class DoubleIntegerAdd extends BinaryOperator {

    public DoubleIntegerAdd() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Double) left + (Integer) right;
    }

}
