package com.weather_report.networking;

import com.weather_report.data.Pull;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by mvasic on 3/31/16.
 */
public enum HttpManager implements Pull<String, String> {

    GET {
        @Override
        public String retrieve(String... urlParams) throws IllegalStateException {
            StringBuilder result = new StringBuilder();
            StringBuilder urlToParse = new StringBuilder();

            for (String path : urlParams) {
                urlToParse.append(path).append("/");
            }

            try {
                URL url = new URL(urlToParse.toString());
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                while ((line = rd.readLine()) != null) {
                    result.append(line);
                }
                rd.close();
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }

            return result.toString();
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
