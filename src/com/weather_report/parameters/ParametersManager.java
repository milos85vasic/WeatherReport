package com.weather_report.parameters;

import com.weather_report.data.Constants;
import com.weather_report.data.KeyValuePair;
import com.weather_report.data.RetrieveData;
import com.weather_report.weather_requests.WEATHER_REQUEST_TYPE;

/**
 * Created by mvasic on 3/22/16.
 */
public enum ParametersManager implements RetrieveData<KeyValuePair<WEATHER_REQUEST_TYPE, Integer>, String> {

    INSTANCE {
        @Override
        public KeyValuePair<WEATHER_REQUEST_TYPE, Integer> retrieve(String... params) {
            String enterParam = params[0];
            if (!enterParam.startsWith(Constants.PARAMETER_LEADING_SIGN)) {
                throw new IllegalArgumentException(String.format("Unrecognized parameter [ %s ]", enterParam));
            }

            // TODO: retrieve should take into account PARAMETER <-- --when for example...
            PARAMETER parameter = PARAMETER.getByValue(enterParam.replace(Constants.PARAMETER_LEADING_SIGN, ""));

            //TODO: Parsing params.
            for (String param : params) {
                System.out.println("Param: " + param);
            }

            return new KeyValuePair<>(WEATHER_REQUEST_TYPE.UNKNOWN);
        }
    }


}
