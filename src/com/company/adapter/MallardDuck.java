package com.company.adapter;

import com.company.adapter.Duck;

public class MallardDuck implements Duck {

    public MallardDuck(){

    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

    @Override
    public void performFly() {
        System.out.println("I'm flying!");
    }

    @Override
    public void performQuack() {
        System.out.println("Quack");
    }
}
