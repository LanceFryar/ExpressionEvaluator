package expressionevaluator;

import expressionevaluator.operations.AddOperation;
import org.junit.Assert;
import org.junit.Test;

public class AddExpressionTest {
    
    @Test
    public void doubleDoubleAddExpressionTest() {
        AddOperation addOperation = new AddOperation(new Constant(4.5), new Constant(2.5));
        Assert.assertEquals(7.0, addOperation.calculate());
    }
   
    @Test
    public void doubleIntegerAddExpressionTest() {
        AddOperation addOperation = new AddOperation(new Constant(4), new Constant(2.5));
        Assert.assertEquals(6.5, addOperation.calculate());
    }

    @Test
    public void integerIntegerAddExpressionTest() {
        AddOperation addOperation = new AddOperation(new Constant(4), new Constant(2));
        Assert.assertEquals(6, addOperation.calculate());
    }
    
    @Test
    public void integerDoubleAddExpressionTest() {
        AddOperation addOperation = new AddOperation(new Constant(4), new Constant(2.5));
        Assert.assertEquals(6.5, addOperation.calculate());
    }
    
}
