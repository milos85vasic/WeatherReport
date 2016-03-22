package com.weather_report.data;

/**
 * Created by mvasic on 3/22/16.
 */
public interface Pull<T, P> {

    T retrieve(P... params) throws IllegalStateException;

}
