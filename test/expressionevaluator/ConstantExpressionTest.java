package expressionevaluator;

import org.junit.Assert;
import org.junit.Test;

public class ConstantExpressionTest {

    @Test
    public void constantExpressionTest() {
        Assert.assertEquals(1, new Constant(1).calculate());
    }

    @Test
    public void otherConstantExpressionTest() {
        Assert.assertEquals(2, new Constant(2).calculate());
    }    
}
