package com.xgy.java_design_patterns_note.strategy;

public class MallardDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
