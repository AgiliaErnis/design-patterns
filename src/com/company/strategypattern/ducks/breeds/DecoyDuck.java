package com.company.strategypattern.ducks.breeds;

import com.company.strategypattern.ducks.Duck;
import com.company.strategypattern.ducks.behaviors.fly.FlyNoWay;
import com.company.strategypattern.ducks.behaviors.fly.FlyWithWings;
import com.company.strategypattern.ducks.behaviors.quack.MuteQuack;
import com.company.strategypattern.ducks.behaviors.quack.Quack;

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
