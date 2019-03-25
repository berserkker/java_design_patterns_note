package com.xgy.java_design_patterns_note.decorator;

public class DarkRoast extends Beverage{

    public DarkRoast(){
    description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
