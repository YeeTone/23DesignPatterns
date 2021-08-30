package behavior.interpreter.expression;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TerminalExpression implements Expression{
    private final Set<String> validWords = new HashSet<>();

    public TerminalExpression(String[] validWords){
        this.validWords.addAll(Arrays.asList(validWords));
    }


    @Override
    public boolean interpret(String expression) {
        return validWords.contains(expression);
    }
}
