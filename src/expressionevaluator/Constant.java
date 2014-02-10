package expressionevaluator;

public class Constant implements Expression {
    final int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override
    public int calculate() {
        return value;
    }
    
}
