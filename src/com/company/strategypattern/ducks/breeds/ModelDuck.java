package com.company.strategypattern.ducks.breeds;

import com.company.strategypattern.ducks.Duck;
import com.company.strategypattern.ducks.behaviors.fly.FlyNoWay;
import com.company.strategypattern.ducks.behaviors.quack.Quack;
import com.company.strategypattern.ducks.behaviors.quack.Squeak;

public class ModelDuck extends Duck {

    public ModelDuck(){
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
