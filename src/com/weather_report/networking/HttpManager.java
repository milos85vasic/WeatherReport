package com.weather_report.networking;

import com.weather_report.data.Pull;

/**
 * Created by mvasic on 3/31/16.
 */
public enum HttpManager implements Pull<String, String> {

    GET {
        @Override
        public String retrieve(String... urlParams) throws IllegalStateException {

            return null;
        }
    },

    POST {
        @Override
        public String retrieve(String... params) throws IllegalStateException {

            return null;
        }
    }


//    StringBuilder result = new StringBuilder();
//    URL url = new URL(urlToRead);
//    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//    conn.setRequestMethod("GET");
//    BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//    String line;
//    while ((line = rd.readLine()) != null) {
//        result.append(line);
//    }
//    rd.close();
//    return result.toString();




}
