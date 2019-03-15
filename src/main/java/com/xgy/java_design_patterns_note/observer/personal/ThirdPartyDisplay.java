package com.xgy.java_design_patterns_note.observer.personal;

//观察者2
public class ThirdPartyDisplay implements Observer, DisplayElement {
    private float humidity;
    private float pressure;
    private float temp;
    private Subject weatherData;

    //需要一个主体对象，在初始化的时候进行注册
    public ThirdPartyDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(humidity + "----" + pressure + "----" + temp);
    }

    @Override
    public void update(Float temp, float humidity, float pressure) {
        //保留自己需要的参数
        this.humidity = humidity;
        this.pressure = pressure;
        this.temp = temp;
        //进行自己的处理
        display();
    }
}
