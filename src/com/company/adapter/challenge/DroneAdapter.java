package com.company.adapter.challenge;

public class DroneAdapter implements Duck {
    Drone drone;

    public DroneAdapter(Drone drone){
        this.drone = drone;
    }

    @Override
    public void display() {

    }

    @Override
    public void performFly() {
        drone.spinRotors();
        drone.takeOff();
    }

    @Override
    public void performQuack() {
        drone.beep();
    }
}
