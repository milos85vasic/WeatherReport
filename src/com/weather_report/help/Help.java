package com.weather_report.help;

import com.google.gson.Gson;
import com.weather_report.Load;
import com.weather_report.data.Constants;
import com.weather_report.help.api.HelpResponse;
import com.weather_report.networking.HttpManager;

/**
 * Created by mvasic on 3/25/16.
 */
public enum Help implements Load {

    INSTANCE {
        @Override
        public void load() {
            String response = HttpManager.GET.retrieve(
                    Constants.Help.SERVER,
                    Constants.Help.SERVICE,
                    String.valueOf(Constants.CODE_VERSION)
            );

            if (response != null && response.length() > 0) {
                Gson gson = new Gson();
                HelpResponse helpResponse = gson.fromJson(response, HelpResponse.class);
                System.out.println(helpResponse);
            }
        }
    }

}
