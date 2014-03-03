package expressionevaluator.operators.division;

import expressionevaluator.operators.BinaryOperator;

public class IntegerDoubleDivision extends BinaryOperator {

    public IntegerDoubleDivision() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Integer) left / (Double) right;
    }

}
