package com.company.strategy.ducks;

import com.company.strategy.ducks.behaviors.fly.FlyRocketPowered;
import com.company.strategy.ducks.breeds.MallardDuck;
import com.company.strategy.ducks.breeds.ModelDuck;

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
