package com.xgy.java_design_patterns_note.decorator;

public class Decaf extends Beverage{

    public Decaf(){
    description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
