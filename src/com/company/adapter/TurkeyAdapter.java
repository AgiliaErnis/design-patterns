package com.company.adapter;

public class TurkeyAdapter implements Duck{

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void display() {
        System.out.println("I'm a Turkey!");
    }

    @Override
    public void performFly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

    @Override
    public void performQuack() {
        turkey.gobble();
    }

}
