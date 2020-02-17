package com.company.strategy.ducks.breeds;

import com.company.strategy.ducks.Duck;
import com.company.strategy.ducks.behaviors.fly.FlyNoWay;
import com.company.strategy.ducks.behaviors.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        setQuackBehavior(new MuteQuack());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
