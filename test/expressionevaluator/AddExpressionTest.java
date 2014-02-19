package expressionevaluator;

import org.junit.Assert;
import org.junit.Test;

public class AddExpressionTest {
    
    public AddExpressionTest() {
    }

    public void doubleDoubleAddExpressionTest() {
        AddOperation addOperation = new AddOperation(new Constant(4.5), new Constant(2.5));
        Assert.assertEquals(7.0, addOperation.calculate());
    }

    public void doubleIntegerAddExpressionTest() {
        AddOperation addOperation = new AddOperation(new Constant(4), new Constant(2.5));
        Assert.assertEquals(6.5, addOperation.calculate());
    }

    public void integerIntegerAddExpressionTest() {
        AddOperation addOperation = new AddOperation(new Constant(4), new Constant(2));
        Assert.assertEquals(6, addOperation.calculate());
    }

    public void integerDoubleAddExpressionTest() {
        AddOperation addOperation = new AddOperation(new Constant(4), new Constant(2.5));
        Assert.assertEquals(6.5, addOperation.calculate());
    }
    
}
