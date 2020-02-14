package com.company.strategypattern.ducks;

import com.company.strategypattern.ducks.behaviors.fly.FlyRocketPowered;
import com.company.strategypattern.ducks.breeds.MallardDuck;
import com.company.strategypattern.ducks.breeds.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
