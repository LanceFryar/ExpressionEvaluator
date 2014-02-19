/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expressionevaluator;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Josue
 */
public class MultiplicationExpressionTest {
    
    @Test
    public void integerDoubleMultiplicationExpressionTest() {
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation(new Constant(4), new Constant(2.5));
        Assert.assertEquals(10.0, multiplicationOperation.calculate());
    }

    @Test
    public void doubleIntegerMultiplicationExpressionTest() {
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation(new Constant(2), new Constant(0.3));
        Assert.assertEquals(0.6, multiplicationOperation.calculate());
    }
    
    @Test
    public void integerIntegerMultiplicationExpressionTest() {
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation(new Constant(4), new Constant(2));
        Assert.assertEquals(8, multiplicationOperation.calculate());
    }
    
    @Test
    public void doubleDoubleMultiplicationExpressionTest() {
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation(new Constant(4.2), new Constant(1.5));
        Assert.assertEquals(6.3, (double) multiplicationOperation.calculate(), 0.01);
    }
    
}
