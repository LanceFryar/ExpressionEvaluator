package expressionevaluator;

import java.awt.Event;


class SubstractOperation extends BinaryOperation{

    SubstractOperation(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public int calculate() {
        return leftExpression.calculate() - rightExpression.calculate();
    }
    
    
    
}
