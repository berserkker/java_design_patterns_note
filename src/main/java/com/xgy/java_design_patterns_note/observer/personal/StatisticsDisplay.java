package com.xgy.java_design_patterns_note.observer.personal;

//观察者3
public class StatisticsDisplay implements Observer,DisplayElement{
    private float humidity;
    private float pressure;
    private Subject weatherData;

    //需要一个主体对象，在初始化的时候进行注册
    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(humidity + "----" + pressure);
    }

    @Override
    public void update(Float temp, float humidity, float pressure) {
        //保留自己需要的参数
        this.humidity = humidity;
        this.pressure = pressure;
        //进行自己的处理
        display();
    }
}
