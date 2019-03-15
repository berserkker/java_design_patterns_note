package com.xgy.java_design_patterns_note.observer.personal;

/**
 * 观察者接口
 * */
public interface Observer {
    //观察者接受到通知后需要做的操作 以及操作所需的参数
    void update(Float temp, float humidity, float pressure);
}
