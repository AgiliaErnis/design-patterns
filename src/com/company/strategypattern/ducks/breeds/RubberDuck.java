package com.company.strategypattern.ducks.breeds;

import com.company.strategypattern.ducks.Duck;
import com.company.strategypattern.ducks.behaviors.fly.FlyNoWay;
import com.company.strategypattern.ducks.behaviors.fly.FlyWithWings;
import com.company.strategypattern.ducks.behaviors.quack.Quack;
import com.company.strategypattern.ducks.behaviors.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck(){
        setQuackBehavior(new Squeak());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
