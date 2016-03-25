package com.weather_report.help;

import com.weather_report.Load;


/**
 * Created by mvasic on 3/25/16.
 */
public enum Help implements Load {

    INSTANCE {
        @Override
        public void load() {
            System.out.println("WeatherReport Help.");
            // TODO: Load help
        }
    }

}
