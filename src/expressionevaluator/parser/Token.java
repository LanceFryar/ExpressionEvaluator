package expressionevaluator.parser;

public abstract class Token {

    public static <Type> Constant constant(Type value) {
        return new Constant(value);
    }

    public static <Type>Symbol symbol(Type token) {
        return new Symbol(token);
    }
    
    public static class Constant<Type> extends Token {

        private final Type value;

        public Constant(Type value) {
            this.value = value;
        }

        public Object value() {
            return value;
        }
    }
    
    public static class Symbol<Type> extends Token {
        private final Type token;
 
        private Symbol(Type token) {
            this.token = token;
        }
 
        @Override
        public boolean equals(Object object) {
            if (object == null) return false;
            return token.equals(object);
        }
    }
}
