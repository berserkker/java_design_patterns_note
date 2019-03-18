package com.xgy.java_design_patterns_note.observer.office;

public class WeatherStation {
    public static void main(String[] args) {
        //增加一个主体对象
        WeatherData weatherData = new WeatherData();

        //注册观察者
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);

        //数据改变，会自动通知观察者做出更新
        weatherData.setMeasurements(1, 2, 3.1f);
        weatherData.setMeasurements(3, 4, 3.2f);
        weatherData.setMeasurements(5, 6, 3.3f);
    }
}
