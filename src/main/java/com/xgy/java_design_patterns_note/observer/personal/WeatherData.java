package com.xgy.java_design_patterns_note.observer.personal;

import java.util.ArrayList;

/**
 * 实现主体接口的主体
 */
public class WeatherData implements Subject {
    private ArrayList observers;

    //通知观察者所需要的参数
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        //初始化list存放注册的观察者
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    //有变化时候通知观察者，此方法可控制变化满足某个条件时再更新
    public void measurementsChanged() {
        notifyObservers();
    }

    //调用此方法，导致发生变化
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

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
