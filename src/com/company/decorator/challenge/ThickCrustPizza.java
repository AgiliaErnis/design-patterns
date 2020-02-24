package com.company.decorator.challenge;

public class ThickCrustPizza extends Food {

    public ThickCrustPizza(){
        this.description = "Thick Crust Pizza";
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
