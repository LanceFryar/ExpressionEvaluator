package expressionevaluator.operations;

import expressionevaluator.BinaryOperator;
import expressionevaluator.BinaryOperatorFactory;
import expressionevaluator.Expression;

/**
 *
 * @author Josue
 */
public class DivisionOperation extends BinaryOperation{

    public DivisionOperation(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public Object calculate() {
        return getOperator().evaluate(leftExpression.calculate(), rightExpression.calculate());
    }

    private BinaryOperator getOperator() {
        return new BinaryOperatorFactory().buildDivisionOperator(leftExpression.calculate(), rightExpression.calculate());
    }
    
}
