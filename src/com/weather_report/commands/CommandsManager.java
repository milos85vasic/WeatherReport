package com.weather_report.commands;

import com.weather_report.Execute;
import com.weather_report.data.Constants;
import com.weather_report.data.KeyValuePair;
import com.weather_report.data.RetrieveData;
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

            // TODO: Work in progress.
//            for (String param : params) {
//                System.out.println("Param: " + param);
//            }

            return new KeyValuePair<>(command, parameters);
        }

        @Override
        public boolean execute(KeyValuePair<COMMAND, KeyValuePair> command) {
            switch (command.getKey()) {
                case HELP:
                    System.out.println("WeatherReport Help.");
                    // TODO: Implement HELP.
                    break;
                case WHEN:
                    System.out.println("Retrieving weather data.");
                    // TODO: Implement weather data scheduling.
                    //return WeatherRequestManager.INSTANCE.schedule();
                    break;
                default:
                    System.err.println("Unrecognized command.");
                    break;
            }
            return true;
        }
    }


}
