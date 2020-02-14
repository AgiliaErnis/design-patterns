package com.company.strategypattern.ducks.behaviors.fly;

import com.company.strategypattern.ducks.behaviors.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
