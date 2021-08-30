package behavior.interpreter.demo;

import behavior.interpreter.context.Context;

public class InterpreterDemo {
    public static void main(String[] args) {
        String[] cities = new String[]{"北京","上海","广州","深圳"};
        String[] people = new String[]{"马云","马化腾","王健林","刘强东"};
        Context context = new Context(cities,people);

        context.free("杭州的马云");
        context.free("深圳的马化腾");
        context.free("大连的王健林");
        context.free("北京的刘强东");
        context.free("深圳的YeeTone");

    }

}
