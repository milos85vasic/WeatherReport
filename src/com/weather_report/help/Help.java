package com.weather_report.help;

import com.weather_report.Load;
import com.weather_report.data.Constants;
import com.weather_report.help.api.HelpResponse;
import com.weather_report.help.api.HelpService;
import retrofit2.Call;


/**
 * Created by mvasic on 3/25/16.
 */
public enum Help implements Load {

    INSTANCE {
        @Override
        public void load() {
            System.out.println("WeatherReport Help.");

            Call<HelpResponse> help = HelpService.INSTANCE
                    .retrieve(Constants.Help.SERVER)
                    .getHelp(
                            Constants.Help.SERVICE,
                            Constants.CODE_VERSION
                    );

            // System.out.println(help);
        }
    }

}
