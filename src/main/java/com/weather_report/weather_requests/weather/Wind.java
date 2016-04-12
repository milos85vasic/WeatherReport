package com.weather_report.weather_requests.weather;

/**
 * Created by mvasic on 4/12/16.
 */
public class Wind {

    private float speed;
    private int deg;

    public Wind(float speed, int deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

}
