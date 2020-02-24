package com.company.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
