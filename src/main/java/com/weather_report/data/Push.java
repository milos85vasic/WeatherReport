package com.weather_report.data;

/**
 * Created by mvasic on 3/22/16.
 */
public interface Push<T, P> {

    void schedule(T type, P... params) throws IllegalStateException;

}
