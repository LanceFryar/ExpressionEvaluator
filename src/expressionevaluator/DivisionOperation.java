package expressionevaluator;

/**
 *
 * @author Josue
 */
public class DivisionOperation extends BinaryOperation{

    public DivisionOperation(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public int calculate() {
        return leftExpression.calculate() / rightExpression.calculate();
    }
    
}
