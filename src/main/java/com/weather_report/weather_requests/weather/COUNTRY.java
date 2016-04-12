package com.weather_report.weather_requests.weather;

/**
 * Created by mvasic on 4/12/16.
 */
public enum COUNTRY {
    USA("usa"),
    UK("uk"),
    SERBIA("rs");

    private String country;

    COUNTRY(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
