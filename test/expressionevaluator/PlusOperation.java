package expressionevaluator;

public class PlusOperation extends BinaryOperation{

    public PlusOperation(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public int calculate() {
        return leftExpression.calculate() + rightExpression.calculate();
    }
}
