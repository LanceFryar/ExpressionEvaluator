package expressionevaluator.operatorfactories;

import expressionevaluator.operators.BinaryOperator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryOperatorFactory {
    
    public BinaryOperatorFactory() {
    }
    
    public BinaryOperator buildAdditionOperator(Object leftValue, Object rightValue) {
        return createAdditionOperator(leftValue, rightValue);
    }

    private BinaryOperator createAdditionOperator(Object leftValue, Object rightValue) {
        try {
            return (BinaryOperator) Class.forName(getSignature(leftValue, rightValue) + "Add").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(BinaryOperatorFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public BinaryOperator buildSubstractOperator(Object leftValue, Object rightValue) {
        return createSubstractOperator(leftValue, rightValue);
    }

    private BinaryOperator createSubstractOperator(Object leftValue, Object rightValue) {
        try {
            return (BinaryOperator) Class.forName(getSignature(leftValue, rightValue) + "Substract").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(BinaryOperatorFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public BinaryOperator buildMultiplictionOperator(Object leftValue, Object rightValue) {
        return createMultiplicationOperator(leftValue, rightValue);
        
    }

    private BinaryOperator createMultiplicationOperator(Object leftValue, Object rightValue) {
        try {
            return (BinaryOperator) Class.forName(getSignature(leftValue, rightValue) + "Multiplication").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(BinaryOperatorFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public BinaryOperator buildDivisionOperator(Object leftValue, Object rightValue) {
        return createDivisionOperator(leftValue, rightValue);
    }

    private BinaryOperator createDivisionOperator(Object leftValue, Object rightValue) {
        try {
            return (BinaryOperator) Class.forName(getSignature(leftValue, rightValue) + "Division").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(BinaryOperatorFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private String getSignature(Object leftValue, Object rightValue) {
        return "expressionevaluator.operators."+ leftValue.getClass().getSimpleName() 
                + rightValue.getClass().getSimpleName();
    }


    
    

}
