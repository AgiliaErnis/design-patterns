package com.company.decorator;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public abstract String getDescription();

    public abstract double cost();
}
