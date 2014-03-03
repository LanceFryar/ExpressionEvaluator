package expressionevaluator.operators.division;

import expressionevaluator.operators.BinaryOperator;

public class DoubleIntegerDivision extends BinaryOperator {

    public DoubleIntegerDivision() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Double) left / (Integer) right;
    }

}
