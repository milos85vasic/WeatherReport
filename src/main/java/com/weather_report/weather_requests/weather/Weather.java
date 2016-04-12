package com.weather_report.weather_requests.weather;

import com.google.gson.Gson;
import com.weather_report.data.Constants;
import com.weather_report.networking.HttpManager;

/**
 * Created by mvasic on 4/12/16.
 */
public class Weather {

    public static class Current {
        public static void load(COUNTRY country, CITY city) {
            String response = HttpManager.GET.retrieve(
                    Constants.Weather.SERVER,
                    Constants.Weather.SERVICE,
                    Constants.Weather.API_VERSION,
                    String.format(
                            "weather?q=%s,%s&appid=%s&units=metric",
                            city.getName(),
                            country,
                            Constants.Weather.API_KEY
                    )
            );

            if (response != null && response.length() > 0) {
//                Gson gson = new Gson();
//                HelpResponse helpResponse = gson.fromJson(response, HelpResponse.class);
                System.out.println(response);
            }
        }
    }

    public class Future {

    }

}
