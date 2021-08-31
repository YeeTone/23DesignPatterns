package behavior.state.weather;

import behavior.state.sky.Sky;

public class Dry implements Weather{
    @Override
    public void handle(Sky sky) {
        System.out.println("It is dry.");
        sky.setWeather(new Damp());
    }
}
