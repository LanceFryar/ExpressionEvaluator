package expressionevaluator.operators;

import expressionevaluator.operators.BinaryOperator;

public class DoubleDoubleAdd extends BinaryOperator {

    public DoubleDoubleAdd() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Double) left + (Double) right;
    }

}
