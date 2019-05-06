package com.xgy.java_design_patterns_note.factory.simple;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        }
        if ("clam".equals(type)) {
            pizza = new ClamPizza();
        }
        if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        }
        if ("veggie".equals(type)) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
