package com.company.strategy.ducks.breeds;

import com.company.strategy.ducks.Duck;
import com.company.strategy.ducks.behaviors.fly.FlyNoWay;
import com.company.strategy.ducks.behaviors.quack.Quack;

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
