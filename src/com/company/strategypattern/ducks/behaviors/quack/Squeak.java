package com.company.strategypattern.ducks.behaviors.quack;

import com.company.strategypattern.ducks.behaviors.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
