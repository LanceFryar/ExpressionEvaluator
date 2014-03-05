package expressionevaluator.operatorfactories;

import expressionevaluator.operators.BinaryOperator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryOperatorFactory {
    
    public BinaryOperatorFactory() {
    }
    
    public BinaryOperator buildOperator(Object leftValue, Object rightValue, String operator) {
        try {
            return (BinaryOperator) Class.forName(getSignature(leftValue, rightValue, operator) + operator).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(BinaryOperatorFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private String getSignature(Object leftValue, Object rightValue, String operator) {
        return "expressionevaluator.operators." + operator.toLowerCase() + ".nkd"
                + leftValue.getClass().getSimpleName() 
                + rightValue.getClass().getSimpleName();
    }
}
