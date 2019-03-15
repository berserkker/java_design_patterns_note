package com.xgy.java_design_patterns_note.observer.personal;

/**
 * 主题对象接口
 */
public interface Subject {
    //观察者注册
    void registerObserver(Observer observer);

    //观察者取消注册
    void removeObserver(Observer observer);

    //通知所有注册的观察者
    void notifyObservers();
}
