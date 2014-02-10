package expressionevaluator;

public class BinaryOperation implements Expression {
    private final Expression rightExpression;
    private final Expression leftExpression;

    public BinaryOperation(Expression leftExpression, Expression rightExpression) {
        this.rightExpression = rightExpression;
        this.leftExpression = leftExpression;
    }

    @Override
    public int calculate() {
        return leftExpression.calculate() + rightExpression.calculate();
    }
    
}
