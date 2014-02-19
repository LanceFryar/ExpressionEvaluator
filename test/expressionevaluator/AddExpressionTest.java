package expressionevaluator;

import expressionevaluator.operations.AddOperation;
import org.junit.Assert;
import org.junit.Test;

public class AddExpressionTest {
    
    private static final double TOLERANCE = 0.01;
    
    @Test
    public void integerIntegerAddExpressionTest() {
        AddOperation addOperation = new AddOperation(new Constant(4), new Constant(2));
        Assert.assertEquals(6, (int)addOperation.calculate());
    }
    
    @Test
    public void doubleDoubleAddExpressionTest() {
        AddOperation addOperation = new AddOperation(new Constant(4.5), new Constant(2.5));
        Assert.assertEquals(7.0, (double) addOperation.calculate(), TOLERANCE);
    }
   
    @Test
    public void doubleIntegerAddExpressionTest() {
        AddOperation addOperation = new AddOperation(new Constant(4), new Constant(2.5));
        Assert.assertEquals(6.5, (double) addOperation.calculate(), TOLERANCE);
    }

    
    @Test
    public void integerDoubleAddExpressionTest() {
        AddOperation addOperation = new AddOperation(new Constant(4), new Constant(2.5));
        Assert.assertEquals(6.5, (double) addOperation.calculate(), TOLERANCE);
    }
    
    
}
