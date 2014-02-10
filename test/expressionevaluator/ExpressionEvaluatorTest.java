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

    public class Expression {
        private int value;
        
        public Expression(int value) {
            this.value = value;
        }
        
        public int calculate() {
            return value;
        }
    }
}
