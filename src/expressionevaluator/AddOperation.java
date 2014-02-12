package expressionevaluator;

public class AddOperation extends BinaryOperation{

    public AddOperation(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public int calculate() {
        return leftExpression.calculate() + rightExpression.calculate();
    }
}
