package com.weather_report;

import com.weather_report.data.KeyValuePair;
import com.weather_report.parameters.ParametersManager;
import com.weather_report.weather_requests.WEATHER_REQUEST_TYPE;
import com.weather_report.weather_requests.WeatherRequestManager;

public class Main {

    public static void main(String[] args) {
        try {
            KeyValuePair<WEATHER_REQUEST_TYPE, Integer> params = ParametersManager.INSTANCE.retrieve(args);
            WeatherRequestManager.INSTANCE.schedule(params.getKey(), params.getValue());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
