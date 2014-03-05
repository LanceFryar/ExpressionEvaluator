package expressionevaluator.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class parserTest {
    
    @Test
    public void singleParserTest() {
        Token tokens[] = {new Token("1"), new Token("+"), new Token("2")};
        assertEquals(new Parser().parse(tokens).calculate(), 3);
    }
}
