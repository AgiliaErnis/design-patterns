package com.company.decorator.challenge;

public class Cheese extends Topping{
    private Food food;

    public Cheese(Food food){
        this.description = "Cheese";
        this.food = food;
    }
    @Override
    public String getDescription() {
        return food.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return food.cost() + 0.20;
    }
}
