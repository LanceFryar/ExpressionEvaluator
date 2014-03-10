package expressionevaluator.parser;

import expressionevaluator.Expression;
import java.util.Stack;

public interface ExpressionFactory {
    public Expression build(Token token);
    public Stack<Expression> getExpressions();
}