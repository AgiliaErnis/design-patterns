package com.company.decorator.challenge;

public class Olives extends Topping{
    private Food food;

    public Olives(Food food){
        this.description = "Olives";
        this.food = food;
    }
    @Override
    public String getDescription() {
        return food.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return food.cost() + 0.15;
    }
}
