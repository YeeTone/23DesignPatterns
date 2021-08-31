package behavior.state.weather;

import behavior.state.sky.Sky;

public interface Weather {
    void handle(Sky sky);
}
