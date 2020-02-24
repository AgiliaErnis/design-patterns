package com.company.decorator;

public class Milk extends Beverage{

    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
        description = "Milk";
    }

    @Override
    public String  getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.05;
    }
}
