package com.weather_report.commands;

/**
 * Created by mvasic on 3/22/16.
 */
public enum COMMAND {
    HELP("Help"),
    WHEN("When"),
    UNKNOWN("Unknown");

    String parameter;

    COMMAND(String parameter) {
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }

    public static COMMAND getByValue(String value) {
        for (COMMAND item : COMMAND.values()) {
            if (item.getParameter().equals(value)) {
                return item;
            }
        }

        return UNKNOWN;
    }
}
