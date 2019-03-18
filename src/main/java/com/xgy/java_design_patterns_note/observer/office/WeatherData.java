package com.xgy.java_design_patterns_note.observer.office;

import java.util.ArrayList;
import java.util.Observable;

/**
 * 实现主体接口的主体
 */
public class WeatherData extends Observable {

    //通知观察者所需要的参数
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    //有变化时候通知观察者，此方法可控制变化满足某个条件时再更新
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    //调用此方法，导致发生变化
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * 采用拉的做法，方便获取数据
     * */
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
