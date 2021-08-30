package behavior.interpreter.context;

import behavior.interpreter.expression.DeExpression;
import behavior.interpreter.expression.Expression;
import behavior.interpreter.expression.TerminalExpression;

public class Context {
    private final Expression deExpression;

    public Context(String[] cities,String[] persons){
        Expression cityTerminal = new TerminalExpression(cities);
        Expression personTerminal = new TerminalExpression(persons);
        this.deExpression = new DeExpression(cityTerminal, personTerminal);
    }

    public void free(String peopleInformation){
        if(deExpression.interpret(peopleInformation)){
            System.out.println("您是"+peopleInformation+", 无需花钱！");
        }else {
            System.out.println("您是"+peopleInformation+", 需要支付！");
        }
    }
}
