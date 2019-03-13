package com.xgy.java_design_patterns_note.strategy;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
