package com.company.strategy.ducks.behaviors.quack;

import com.company.strategy.ducks.behaviors.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
