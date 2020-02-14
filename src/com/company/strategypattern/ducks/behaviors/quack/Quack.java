package com.company.strategypattern.ducks.behaviors.quack;

import com.company.strategypattern.ducks.behaviors.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
