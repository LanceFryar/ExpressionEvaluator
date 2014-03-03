package expressionevaluator.operators.multiplication;

import expressionevaluator.operators.BinaryOperator;

public class DoubleDoubleMultiplication extends BinaryOperator {

    public DoubleDoubleMultiplication() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Double) left * (Double) right;
    }

}
