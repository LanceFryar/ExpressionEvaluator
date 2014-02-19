package expressionevaluator;

public class Constant <Type> implements Expression {
    final Type value;

    public Constant (Type value) {
        this.value = value;
    }

    @Override
   public Type calculate() {
        return value;
    }
    
}
