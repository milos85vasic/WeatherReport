package com.weather_report.weather_requests;

import com.weather_report.data.ScheduleData;
import com.weather_report.weather_requests.weather.CITY;
import com.weather_report.weather_requests.weather.COUNTRY;
import com.weather_report.weather_requests.weather.Weather;

/**
 * Created by mvasic on 3/22/16.
 */
public enum WeatherRequestManager implements ScheduleData<WEATHER_REQUEST_TYPE, Integer> {

    INSTANCE {
        @Override
        public void schedule(WEATHER_REQUEST_TYPE type, Integer... params) {
            switch (type) {
                case CURRENT:
                    System.out.println("Retrieving weather for the current day.");
                    Weather.Current.load(COUNTRY.SERBIA, CITY.BELGRADE);
                    break;
                case FUTURE:
                    if (params.length == 0) {
                        throw new IllegalStateException("Number of days for which we want weather data must be provided.");
                    }

                    System.out.println(String.format("Retrieving data for the next %d days.", params[0]));
                    break;
                default:
                    throw new IllegalStateException(String.format("Can't handle type [ %s ]", type));
            }
        }
    }

}
