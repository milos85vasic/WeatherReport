package com.weather_report.parameters;

/**
 * Created by mvasic on 3/22/16.
 */
public enum PARAMETER {
    WHEN("When"),
    UNKNOWN("Unknown");

    String parameter;

    PARAMETER(String parameter) {
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }

    public static PARAMETER getByValue(String value) {
        for (PARAMETER item : PARAMETER.values()) {
            if (item.getParameter().equals(value)) {
                return item;
            }
        }

        return UNKNOWN;
    }
}
