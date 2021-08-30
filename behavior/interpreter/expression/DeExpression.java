package behavior.interpreter.expression;

public class DeExpression implements Expression{
    private final Expression city;
    private final Expression person;

    public DeExpression(Expression city, Expression person){
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String expression) {
        String[] split = expression.split("的");
        return city.interpret(split[0]) && person.interpret(split[1]);

    }
}
