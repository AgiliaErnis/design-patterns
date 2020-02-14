package com.company.strategypattern.ducks.behaviors.fly;

import com.company.strategypattern.ducks.behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
