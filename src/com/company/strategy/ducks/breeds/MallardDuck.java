package com.company.strategy.ducks.breeds;

import com.company.strategy.ducks.Duck;
import com.company.strategy.ducks.behaviors.fly.FlyWithWings;
import com.company.strategy.ducks.behaviors.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
