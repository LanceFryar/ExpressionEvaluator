package expressionevaluator;

public class MultiplicationOperation extends BinaryOperation{

    public MultiplicationOperation(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }
    
    @Override
    public Object calculate() {
        return leftExpression.calculate() * rightExpression.calculate();
    }
}
