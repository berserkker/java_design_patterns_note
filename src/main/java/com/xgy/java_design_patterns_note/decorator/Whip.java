package com.xgy.java_design_patterns_note.decorator;

public class Whip extends Condiment {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
