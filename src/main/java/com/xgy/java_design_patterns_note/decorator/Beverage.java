package com.xgy.java_design_patterns_note.decorator;

/**
 * 饮料父类
 * */
public abstract class Beverage {
    String description = "未知饮料";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
