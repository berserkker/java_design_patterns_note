package com.xgy.java_design_patterns_note.factory.advanced;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    void prepare() {
        System.out.println(name + dough + sauce);
    }

    void bake() {

    }

    void cut() {

    }

    void box() {

    }

}
