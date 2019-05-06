package com.xgy.java_design_patterns_note.factory.advanced;


public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    /**
     * 让不同的子类来决定具体的创建，每个子类相当于不同的工厂
     * 将客户代码与实际创建的代码隔离开来
     * */
    protected abstract Pizza createPizza(String type);
}
