package com.xgy.java_design_patterns_note.decorator;

public class HouseBlend extends Beverage{

    public HouseBlend(){
    description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .99;
    }
}
