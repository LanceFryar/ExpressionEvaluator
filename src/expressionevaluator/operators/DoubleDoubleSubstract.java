package expressionevaluator.operators;

import expressionevaluator.operators.BinaryOperator;

public class DoubleDoubleSubstract extends BinaryOperator {

    public DoubleDoubleSubstract() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Double) left - (Double) right;
    }

}
