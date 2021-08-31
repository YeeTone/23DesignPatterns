package behavior.state.sky;

import behavior.state.weather.Weather;

public class Sky {
    private Weather weather;

    public Sky(Weather weather) {
        this.weather = weather;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public void handle(){
        weather.handle(this);
    }
}
