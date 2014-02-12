package expressionevaluator;

import expressionevaluator.BinaryOperation;
import expressionevaluator.Expression;

public class MultiplicationOperation extends BinaryOperation{

    public MultiplicationOperation(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }
    
    @Override
    public int calculate() {
        return leftExpression.calculate() * rightExpression.calculate();
    }
}
