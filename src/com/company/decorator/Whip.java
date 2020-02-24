package com.company.decorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        description = "Whip";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }
}
