package com.weather_report.help.api;

import com.weather_report.data.Constants;

/**
 * Created by mvasic on 3/31/16.
 */
public class HelpResponse {

    @Override
    public String toString() {
        return String.format("%s %s\n", Constants.APP_NAME, Constants.VERSION);
    }

}
