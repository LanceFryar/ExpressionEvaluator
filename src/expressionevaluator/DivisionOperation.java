/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expressionevaluator;

/**
 *
 * @author Josue
 */
class DivisionOperation extends BinaryOperation{

    public DivisionOperation(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    public int calculate() {
        return leftExpression.calculate() / rightExpression.calculate();
    }
    
}
