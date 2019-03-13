package com.xgy.java_design_patterns_note.strategy;

public class FlyRocketPower implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i'm flying with a rocket");
    }
}
