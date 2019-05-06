package com.xgy.java_design_patterns_note.factory.advanced;


public class ChicagoStylePizzaStore extends PizzaStore {
    /**
     * 让不同的子类来决定具体的创建，每个子类相当于不同的工厂
     * 将客户代码与实际创建的代码隔离开来
     *
     * @param type
     */
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
