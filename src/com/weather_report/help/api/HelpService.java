package com.weather_report.help.api;

import com.weather_report.data.RetrieveData;
import com.weather_report.help.api.HelpApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mvasic on 3/29/16.
 */
public enum HelpService implements RetrieveData<HelpApi, String> {

    INSTANCE {
        @Override
        public HelpApi retrieve(String... params) throws IllegalStateException {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(params[0])
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            return retrofit.create(HelpApi.class);
        }
    }

}
