package com.weather_report.help;

import com.weather_report.data.Constants;
import com.weather_report.data.RetrieveData;
import retrofit2.Retrofit;

/**
 * Created by mvasic on 3/29/16.
 */
public enum HelpService implements RetrieveData<HelpApi, String> {

    INSTANCE {
        @Override
        public HelpApi retrieve(String... params) throws IllegalStateException {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(params[0])
                    .build();


            return retrofit.create(HelpApi.class);
        }
    }

}
