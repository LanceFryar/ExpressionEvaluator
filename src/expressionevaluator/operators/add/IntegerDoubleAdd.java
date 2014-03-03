package expressionevaluator.operators.add;

import expressionevaluator.operators.BinaryOperator;

public class IntegerDoubleAdd extends BinaryOperator {

    public IntegerDoubleAdd() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Integer) left + (Double) right;
    }

}
