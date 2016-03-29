package com.weather_report.help;

import com.weather_report.Load;
import com.weather_report.data.Constants;


/**
 * Created by mvasic on 3/25/16.
 */
public enum Help implements Load {

    INSTANCE {
        @Override
        public void load() {
            System.out.println("WeatherReport Help.");

            String help = HelpService.INSTANCE
                    .retrieve(Constants.Help.SERVER)
                    .getHelp(
                            Constants.Help.SERVICE,
                            Constants.VERSION
                    );

            System.out.println("RETROFIT RESPONSE:\n\n" + help);
        }
    }

}
