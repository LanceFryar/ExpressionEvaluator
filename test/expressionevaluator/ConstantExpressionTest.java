package expressionevaluator;

import org.junit.Assert;
import org.junit.Test;

public class ConstantExpressionTest {

    @Test
    public void integerConstantExpressionTest() {
        Assert.assertEquals(1, (int) new Constant<>(1).calculate());
    }
    
    @Test
    public void doubleContantTest(){
        Assert.assertEquals(0.2, new Constant<>(0.2).calculate(), 0.01);
    }
}
