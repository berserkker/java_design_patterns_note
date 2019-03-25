package com.xgy.java_design_patterns_note.decorator;

/**
 * 调料类，装饰者类 需要可以取代父类 所以要继承自父类
 * */
public abstract class Condiment extends Beverage{
    public abstract String getDescription();
}
