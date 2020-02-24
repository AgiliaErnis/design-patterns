package com.company.decorator;

public class Mocha extends Beverage{

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
        description = "Mocha";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
