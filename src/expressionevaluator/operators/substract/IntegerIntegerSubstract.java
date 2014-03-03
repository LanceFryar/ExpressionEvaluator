package expressionevaluator.operators.substract;

import expressionevaluator.operators.BinaryOperator;

public class IntegerIntegerSubstract extends BinaryOperator {

    public IntegerIntegerSubstract() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Integer) left - (Integer) right;
    }

}
