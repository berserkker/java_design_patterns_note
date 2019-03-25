package com.xgy.java_design_patterns_note.decorator;

public class Mocha extends Condiment {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
