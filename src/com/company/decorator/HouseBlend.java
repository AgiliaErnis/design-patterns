package com.company.decorator;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Blend";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.20;
    }
}
