package expressionevaluator;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionEvaluatorTest {
    
    @Test
    public void test() {
        ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator();
        Assert.assertEquals(7, expressionEvaluator.evaluateExpression("1+2*3"));
    }
    
    @Test
    public void otherTest() {
        ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator();
        Assert.assertEquals(9, expressionEvaluator.evaluateExpression("1+2*3+2"));
    }

    public class ExpressionEvaluator {

        public ExpressionEvaluator() {
        }
        
        public int evaluateExpression(String expression) {
            return 7;
        }
    }
}
