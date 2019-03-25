package com.xgy.java_design_patterns_note.decorator;

public class Espresso extends Beverage{

    public Espresso(){
    description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
