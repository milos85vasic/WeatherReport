package com.weather_report.weather_requests.weather;

/**
 * Created by mvasic on 4/12/16.
 */
public class WeatherStatus {

    private String main;
    private String description;

    public WeatherStatus(String main, String description) {
        this.main = main;
        this.description = description;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
