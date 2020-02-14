package com.company.strategypattern.ducks.breeds;

import com.company.strategypattern.ducks.Duck;
import com.company.strategypattern.ducks.behaviors.fly.FlyWithWings;
import com.company.strategypattern.ducks.behaviors.quack.Quack;

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
