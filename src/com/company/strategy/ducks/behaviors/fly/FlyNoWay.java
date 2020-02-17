package com.company.strategy.ducks.behaviors.fly;

import com.company.strategy.ducks.behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
