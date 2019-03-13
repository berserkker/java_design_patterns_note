package com.xgy.java_design_patterns_note.strategy;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<silence>");
    }
}
