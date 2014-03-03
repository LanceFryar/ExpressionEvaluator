package expressionevaluator.operators.multiplication;

import expressionevaluator.operators.BinaryOperator;

public class IntegerDoubleMultiplication extends BinaryOperator {

    public IntegerDoubleMultiplication() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Integer) left * (Double) right;
    }

}
