package com.xgy.java_design_patterns_note.strategy;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("gua gua gua");
    }
}
