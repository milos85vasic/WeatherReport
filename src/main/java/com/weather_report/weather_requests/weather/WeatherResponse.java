package com.weather_report.weather_requests.weather;

import java.util.List;

/**
 * Created by mvasic on 4/12/16.
 */
public class WeatherResponse {

    private List<WeatherStatus> weather;
    private WeatherSpecs main;
    private Wind wind;

    public WeatherResponse(List<WeatherStatus> weather, WeatherSpecs main, Wind wind) {
        this.weather = weather;
        this.main = main;
        this.wind = wind;
    }

    public List<WeatherStatus> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherStatus> weather) {
        this.weather = weather;
    }

    public WeatherSpecs getMain() {
        return main;
    }

    public void setMain(WeatherSpecs main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @Override
    public String toString() {
        StringBuilder wther = new StringBuilder();
        for (WeatherStatus status : weather) {
            wther.append(String.format("Weather: %s, %s", status.getMain(), status.getDescription()));
        }
        return String.format(
                "%s\nTemperature: %s\nPressure: %s\nHumidity: %s\nMin. temp.: %s\nMax. temp.: %s\nWind speed: %s, %s degrees.",
                wther,
                main.getTemp(),
                main.getPressure(),
                main.getHumidity(),
                main.getTemp_min(),
                main.getTemp_max(),
                wind.getSpeed(),
                wind.getDeg()
        );
    }

}
