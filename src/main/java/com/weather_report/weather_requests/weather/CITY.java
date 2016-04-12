package com.weather_report.weather_requests.weather;

/**
 * Created by mvasic on 4/12/16.
 */
public enum CITY {
    BELGRADE("Belgrade");

    private String name;

    CITY(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
