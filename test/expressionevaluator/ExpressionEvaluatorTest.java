package expressionevaluator;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionEvaluatorTest {

    @Test
    public void constantExpressionTest() {
        Assert.assertEquals(1, new Constant(1).calculate());
    }

    @Test
    public void otherConstantExpressionTest() {
        Assert.assertEquals(2, new Constant(2).calculate());
    }

    @Test
    public void singleOperandExpressionTest() {
        BinaryOperation binaryOperation = new BinaryOperation("+", new Constant(2), new Constant(3));
        Assert.assertEquals(5, binaryOperation.calculate());
    }

    public interface Expression {

        public int calculate();
    }

    public class Constant implements Expression {
        private final int value;

        public Constant(int value) {
            this.value = value;
        }

        @Override
        public int calculate() {
            return value;
        }

    }

    public class BinaryOperation implements Expression {
        private final Expression rightExpression, leftExpression;

        public BinaryOperation(String operand, Expression leftExpression, Expression rightExpression) {
            this.rightExpression = rightExpression;
            this.leftExpression = leftExpression;
        }

        @Override
        public int calculate() {
            return leftExpression.calculate() + rightExpression.calculate();
        }
    }
}
