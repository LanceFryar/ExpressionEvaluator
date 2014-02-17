package expressionevaluator;

public abstract class BinaryOperator {
    protected Object left;
    protected Object right;
    
    public abstract Object evaluate (Object left, Object right);
}
