package behavioral.interpret;

import java.util.StringTokenizer;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 14:28
 **/
public class TerminalExpression extends Expression {
    private String literal = null;

    public TerminalExpression(String str) {
        literal = str;
    }

    @Override
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if (test.equals(literal)) {
                return true;
            }
        }
        return false;
    }
}
