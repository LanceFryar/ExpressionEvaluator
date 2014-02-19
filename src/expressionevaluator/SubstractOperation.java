package expressionevaluator;

import java.awt.Event;


public class SubstractOperation extends BinaryOperation{

    SubstractOperation(Expression leftExpression, Expression rightExpression) {
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
