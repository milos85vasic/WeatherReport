package com.weather_report.help;

import com.weather_report.Load;
import com.weather_report.data.Constants;
import com.weather_report.networking.HttpManager;

/**
 * Created by mvasic on 3/25/16.
 */
public enum Help implements Load {

    INSTANCE {
        @Override
        public void load() {
            System.out.println("WeatherReport Help.");

            String response = HttpManager.GET.retrieve(
                    Constants.Help.SERVER,
                    Constants.Help.SERVICE,
                    String.valueOf(Constants.CODE_VERSION)
            );

            System.out.println(">>> " + response);
        }
    }

}
