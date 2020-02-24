package com.company.decorator.challenge;

public class PizzaStore {

    public static void main(String[] args) {

        Food food = new ThinCrustPizza();
        food = new Olives(food);
        food = new Peppers(food);
        food = new Cheese(food);

        System.out.println("Your order: " + food.getDescription() + ", " + String.format("%.2f", food.cost()) + "$.");

        Food food2 = new ThinCrustPizza();
        food2 = new Olives(food2);
        food2 = new Cheese(food2);
        food2 = new Cheese(food2);

        System.out.println("Your order: " + food2.getDescription() + ", " + String.format("%.2f", food2.cost()) + "$.");
    }
}
