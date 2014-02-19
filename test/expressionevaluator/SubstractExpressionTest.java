/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expressionevaluator;

import expressionevaluator.operations.SubstractOperation;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Josue
 */
public class SubstractExpressionTest {
    
    private static final double TOLERANCE = 0.01;
    
    @Test
    public void integerIntegerSubstractExpressionTest() {
        SubstractOperation substractOperation = new SubstractOperation(new Constant(4), new Constant(2));
        Assert.assertEquals(2, (int) substractOperation.calculate());
    }

    @Test
    public void doubleDoubleSubstractExpressionTest() {
        SubstractOperation substractOperation = new SubstractOperation(new Constant(4.5), new Constant(2.5));
        Assert.assertEquals(2.0,(double) substractOperation.calculate(), TOLERANCE);
    }

    @Test
    public void doubleIntegerSubstractExpressionTest() {
        SubstractOperation substractOperation = new SubstractOperation(new Constant(4), new Constant(2.5));
        Assert.assertEquals(1.5, (double) substractOperation.calculate(), TOLERANCE);
    }

    @Test
    public void integerDoubleSubstractExpressionTest() {
        SubstractOperation substractOperation = new SubstractOperation(new Constant(4), new Constant(2.5));
        Assert.assertEquals(1.5, (double) substractOperation.calculate(), TOLERANCE);
    }
    
}
