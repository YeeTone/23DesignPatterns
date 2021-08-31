package behavior.state.weather;

import behavior.state.sky.Sky;

public class Damp implements Weather{
    @Override
    public void handle(Sky sky) {
        System.out.println("It is damp.");
        sky.setWeather(new Sunny());
    }
}
