package com.weather_report.weather_requests;

/**
 * Created by mvasic on 3/22/16.
 */
public enum WEATHER_REQUEST_TYPE {
    CURRENT("Current"),
    FUTURE("Future"),
    UNKNOWN("Unknown");

    String type;

    WEATHER_REQUEST_TYPE(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public WEATHER_REQUEST_TYPE getByValue(String value) {
        for (WEATHER_REQUEST_TYPE item : WEATHER_REQUEST_TYPE.values()) {
            if (item.getType().equals(value)) {
                return item;
            }
        }

        return UNKNOWN;
    }

}
