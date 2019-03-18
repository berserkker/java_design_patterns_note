package com.xgy.java_design_patterns_note.observer.office;

import java.util.Observable;
import java.util.Observer;

//观察者2
public class ThirdPartyDisplay implements Observer, DisplayElement {
    private float humidity;
    private float pressure;
    private float temp;
    private Observable observable;

    //需要一个主体对象，在初始化的时候进行注册
    public ThirdPartyDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(humidity + "----" + pressure + "----" + temp);
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.pressure = weatherData.getPressure();
            this.humidity = weatherData.getHumidity();
            this.temp = weatherData.getTemperature();
            display();
        }
    }
}
