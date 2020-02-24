package com.company.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast Coffee";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
