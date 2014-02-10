package expressionevaluator;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionEvaluatorTest {

    @Test
    public void constantExpressionTest() {
        Expression expression = new Expression(1);
        Assert.assertEquals(1, expression.calculate());
    }

    @Test
    public void otherConstantExpressionTest() {
        Expression expression = new Expression(2);
        Assert.assertEquals(2, expression.calculate());
    }

    @Test
    public void singleOperandExpressionTest() {
        Expression expression = new Expression("+", new Expression(2), new Expression(3));
        Assert.assertEquals(5, expression.calculate());
    }

    public class Expression {

        private String value;
        private boolean isOperator;
        private Expression rightExpression, leftExpression;

        public Expression(int value) {
            this.value = String.valueOf(value);
            this.isOperator = false;
        }

        public Expression(String operand, Expression rightExpression, Expression leftExpression) {
            this.value = operand;
            this.isOperator = true;
            this.rightExpression = rightExpression;
            this.leftExpression = leftExpression;
        }

        public int calculate() {
            if (isOperator) {
                return rightExpression.calculate() +  leftExpression.calculate();
            } 
            else return Integer.valueOf(value);
        }
    }
}