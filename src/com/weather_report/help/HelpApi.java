package com.weather_report.help;

import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by mvasic on 3/29/16.
 */
public interface HelpApi {

    @GET("{service_root}/{code_version}")
    String getHelp(@Path("service_root") String serviceRoot, @Path("code_version") Long codeVersion);

}
