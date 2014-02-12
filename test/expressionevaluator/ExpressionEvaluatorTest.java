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
    public void singleSubstractExpressionTest() {
        SubstractOperation substractOperation = new SubstractOperation(new Constant(3), new Constant(1));
        Assert.assertEquals(2, substractOperation.calculate());
    }
    
    @Test
    public void singleDivisionExpressionTest(){
        DivisionOperation divisionOperation = new DivisionOperation(new Constant(4), new Constant(2));
        Assert.assertEquals(2, divisionOperation.calculate());
    }
    
    @Test
    public void singleMultiplicationExpressionTest() {
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation(new Constant(4), new Constant(2));
        Assert.assertEquals(8, multiplicationOperation.calculate());
    }
    
    @Test
    public void singlePlusExpressionTest() {
        AddOperation plusOperation = new AddOperation(new Constant(4), new Constant(2));
        Assert.assertEquals(6, plusOperation.calculate());
    }
    
    
}
