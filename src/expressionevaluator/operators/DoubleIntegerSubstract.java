package expressionevaluator.operators;

import expressionevaluator.operators.BinaryOperator;

public class DoubleIntegerSubstract extends BinaryOperator {

    public DoubleIntegerSubstract() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Double) left - (Integer) right;
    }

}
