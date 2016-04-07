package com.weather_report.commands;

import com.weather_report.Execute;
import com.weather_report.data.Constants;
import com.weather_report.data.KeyValuePair;
import com.weather_report.data.RetrieveData;
import com.weather_report.help.Help;
import com.weather_report.weather_requests.WEATHER_REQUEST_TYPE;
import com.weather_report.weather_requests.WeatherRequestManager;

/**
 * Created by mvasic on 3/22/16.
 */
public enum CommandsManager implements
        RetrieveData<KeyValuePair<COMMAND, KeyValuePair>, String>,
        Execute<KeyValuePair<COMMAND, KeyValuePair>> {

    INSTANCE {
        @Override
        public KeyValuePair<COMMAND, KeyValuePair> retrieve(String... params) {
            String enterParam = params[0];
            if (!enterParam.startsWith(Constants.PARAMETER_LEADING_SIGN)) {
                throw new IllegalArgumentException(String.format("Unrecognized command [ %s ]", enterParam));
            }

            COMMAND command = COMMAND.getByValue(enterParam.replace(Constants.PARAMETER_LEADING_SIGN, ""));
            KeyValuePair parameters = null;

            switch (command) {
                case WHEN:
                    if (params.length < 2) {
                        throw new IllegalArgumentException("--When, expects at least 1 additional parameter.");
                    }

                    WEATHER_REQUEST_TYPE requestType = WEATHER_REQUEST_TYPE.getByValue(params[1]);
                    if (requestType.equals(WEATHER_REQUEST_TYPE.FUTURE)) {
                        if (params.length < 3) {
                            throw new IllegalArgumentException("--When Future, expects at least 1 additional parameter.");
                        }

                        Integer days = Integer.valueOf(params[2]);
                        parameters = new KeyValuePair<>(requestType, days);
                    } else {
                        parameters = new KeyValuePair<>(requestType);
                    }
                    break;
                default:
                    break;
            }

            return new KeyValuePair<>(command, parameters);
        }

        @Override
        public boolean execute(KeyValuePair<COMMAND, KeyValuePair> command) {
            switch (command.getKey()) {
                case HELP:
                    Help.INSTANCE.load();
                    break;
                case WHEN:
                    KeyValuePair<WEATHER_REQUEST_TYPE, Integer> weatherParams = command.getValue();
                    WeatherRequestManager.INSTANCE.schedule(weatherParams.getKey(), weatherParams.getValue());
                    break;
                default:
                    System.err.println("Unrecognized command.");
                    break;
            }
            return true;
        }
    }


}
