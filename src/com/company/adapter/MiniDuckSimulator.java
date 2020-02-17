package com.company.adapter;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();
        testDuck(duck);

        Turkey turkey= new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.performQuack();
        duck.performFly();
    }
}
