package com.company.decorator.challenge;

public class Peppers extends Topping{
    private Food food;

    public Peppers(Food food){
        this.description = "Peppers";
        this.food = food;
    }
    @Override
    public String getDescription() {
        return food.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return food.cost() + 0.10;
    }
}
