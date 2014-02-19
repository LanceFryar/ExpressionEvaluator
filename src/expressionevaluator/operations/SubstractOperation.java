package expressionevaluator.operations;

import expressionevaluator.BinaryOperator;
import expressionevaluator.BinaryOperatorFactory;
import expressionevaluator.Expression;


public class SubstractOperation extends BinaryOperation{

    public SubstractOperation(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public Object calculate() {
        return getOperator().evaluate(leftExpression.calculate(), rightExpression.calculate());
    }

    private BinaryOperator getOperator() {
        return new BinaryOperatorFactory().buildSubstractOperator(leftExpression.calculate(), rightExpression.calculate());
    }
    
    
    
}
