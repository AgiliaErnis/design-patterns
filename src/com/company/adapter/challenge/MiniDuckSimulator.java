package com.company.adapter.challenge;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        testDuck(droneAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.performQuack();
        duck.performFly();
    }
}
