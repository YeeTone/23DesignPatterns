package behavior.state.weather;

import behavior.state.sky.Sky;

public class Sunny implements Weather{
    @Override
    public void handle(Sky sky) {
        System.out.println("It is sunny.");
        sky.setWeather(new Rain());
    }
}
