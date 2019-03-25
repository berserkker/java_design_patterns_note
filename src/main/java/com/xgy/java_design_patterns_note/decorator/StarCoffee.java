package com.xgy.java_design_patterns_note.decorator;

public class StarCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " " + beverage.cost());


        //制造一个DarkRoast对象
        Beverage beverage1 = new DarkRoast();
        //用mocha装饰
        beverage1 = new Mocha(beverage1);
        //用第二个mocha装饰
        beverage1 = new Mocha(beverage1);
        //用Whip装饰
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription() + " " + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " " + beverage2.cost());

    }
}
