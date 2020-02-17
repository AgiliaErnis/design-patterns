package com.company.strategy.ducks.breeds;

import com.company.strategy.ducks.Duck;
import com.company.strategy.ducks.behaviors.fly.FlyNoWay;
import com.company.strategy.ducks.behaviors.quack.Squeak;

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
