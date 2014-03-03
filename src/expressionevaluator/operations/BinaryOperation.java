package expressionevaluator.operations;

import expressionevaluator.Expression;
import expressionevaluator.operatorfactories.BinaryOperatorFactory;
import expressionevaluator.operators.BinaryOperator;

public abstract class BinaryOperation implements Expression {
    protected final Expression rightExpression;
    protected final Expression leftExpression;

    public BinaryOperation(Expression leftExpression, Expression rightExpression) {
        this.rightExpression = rightExpression;
        this.leftExpression = leftExpression;
    }

    @Override
    public Object calculate() {
        return getOperator().evaluate(leftExpression.calculate(), rightExpression.calculate());
    }

    protected BinaryOperator getOperator() {
        return new BinaryOperatorFactory().buildOperator(leftExpression.calculate(), rightExpression.calculate(), this.getClass().getSimpleName().replace("Operation", ""));
    }
    
}
