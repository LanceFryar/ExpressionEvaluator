/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expressionevaluator;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Josue
 */
public class SubstractExpressionTest {
    
    public SubstractExpressionTest() {
    }

    public void integerIntegerSubstractExpressionTest() {
        SubstractOperation substractOperation = new SubstractOperation(new Constant(4), new Constant(2));
        Assert.assertEquals(2, substractOperation.calculate());
    }

    public void doubleDoubleSubstractExpressionTest() {
        SubstractOperation substractOperation = new SubstractOperation(new Constant(4.5), new Constant(2.5));
        Assert.assertEquals(2.0, substractOperation.calculate());
    }

    public void doubleIntegerSubstractExpressionTest() {
        SubstractOperation substractOperation = new SubstractOperation(new Constant(4), new Constant(2.5));
        Assert.assertEquals(1.5, substractOperation.calculate());
    }

    public void integerDoubleSubstractExpressionTest() {
        SubstractOperation substractOperation = new SubstractOperation(new Constant(4), new Constant(2.5));
        Assert.assertEquals(1.5, substractOperation.calculate());
    }
    
}
