package com.weather_report;

/**
 * Created by mvasic on 3/25/16.
 */
public interface Execute<T> {

    boolean execute(T command);

}
