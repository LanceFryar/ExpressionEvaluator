/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expressionevaluator;

import expressionevaluator.operations.MultiplicationOperation;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Josue
 */
public class MultiplicationExpressionTest {
    
    private static final double TOLERANCE = 0.01;
    
    @Test
    public void integerIntegerMultiplicationExpressionTest() {
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation(new Constant(4), new Constant(2));
        Assert.assertEquals(8,(int) multiplicationOperation.calculate());
    }
     
    @Test
    public void integerDoubleMultiplicationExpressionTest() {
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation(new Constant(4), new Constant(2.5));
        Assert.assertEquals(10.0, (double) multiplicationOperation.calculate() , TOLERANCE);
    }

    @Test
    public void doubleIntegerMultiplicationExpressionTest() {
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation(new Constant(2), new Constant(0.3));
        Assert.assertEquals(0.6, (double) multiplicationOperation.calculate(), TOLERANCE);
    }
    
    
    @Test
    public void doubleDoubleMultiplicationExpressionTest() {
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation(new Constant(4.2), new Constant(1.5));
        Assert.assertEquals(6.3, (double) multiplicationOperation.calculate(), TOLERANCE);
    }
    
}
