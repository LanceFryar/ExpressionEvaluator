package expressionevaluator.operators;
import expressionevaluator.operators.BinaryOperator;

public class DoubleIntegetMultiplication extends BinaryOperator {

    public DoubleIntegetMultiplication() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Double) left * (Integer) right;
    }

}
