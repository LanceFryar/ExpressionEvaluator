package expressionevaluator;

public class AddOperation extends BinaryOperation{

    public AddOperation(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public Object calculate() {
        return getOperator(leftExpression.calculate(), leftExpression.calculate()).evaluate();
    }

    private BinaryOperator getOperator(Object leftValue, Object rightValue) {
        return new BinaryOperatorFactory().buildAdditionOperator(leftValue, rightValue);
    }
}
