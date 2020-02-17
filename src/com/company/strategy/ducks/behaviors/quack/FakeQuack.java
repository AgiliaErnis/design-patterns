package com.company.strategy.ducks.behaviors.quack;

import com.company.strategy.ducks.behaviors.QuackBehavior;

public class FakeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Qwak");
    }
}
