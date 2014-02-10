package expressionevaluator;

public abstract class BinaryOperation implements Expression {
    protected final Expression rightExpression;
    protected final Expression leftExpression;

    public BinaryOperation(Expression leftExpression, Expression rightExpression) {
        this.rightExpression = rightExpression;
        this.leftExpression = leftExpression;
    }

    public abstract int calculate();
    
}
