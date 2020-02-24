package com.company.decorator.challenge;

public class ThinCrustPizza extends Food {

    public ThinCrustPizza(){
        this.description = "Thin Crust Pizza";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.00;
    }
}
