package com.company.strategy.ducks.behaviors.fly;

import com.company.strategy.ducks.behaviors.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
