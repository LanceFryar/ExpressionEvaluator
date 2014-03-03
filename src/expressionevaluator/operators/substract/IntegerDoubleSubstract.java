package expressionevaluator.operators.substract;

import expressionevaluator.operators.BinaryOperator;

public class IntegerDoubleSubstract extends BinaryOperator {

    public IntegerDoubleSubstract() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Integer) left - (Double) right;
    }

}
