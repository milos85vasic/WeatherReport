package com.weather_report.networking;

import com.weather_report.data.Pull;

/**
 * Created by mvasic on 3/31/16.
 */
public enum HttpManager implements Pull<String, String> {

    GET {
        @Override
        public String retrieve(String... urlParams) throws IllegalStateException {
            // TODO: Finish this.
            return null;
        }
    },

    POST {
        @Override
        public String retrieve(String... params) throws IllegalStateException {
            // TODO: To be implemented.
            return null;
        }
    }

}
