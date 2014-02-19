package expressionevaluator;

import java.awt.Event;


public class SubstractOperation extends BinaryOperation{

    SubstractOperation(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public Object calculate() {
        return leftExpression.calculate() - rightExpression.calculate();
    }
    
    
    
}
