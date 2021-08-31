package behavior.state.demo;

import behavior.state.sky.Sky;
import behavior.state.weather.Sunny;
import behavior.state.weather.Weather;

public class StateDemo {
    public static void main(String[] args) {
        Weather start = new Sunny();

        Sky sky = new Sky(start);

        sky.handle();
        sky.handle();
        sky.handle();
        sky.handle();
    }
}
