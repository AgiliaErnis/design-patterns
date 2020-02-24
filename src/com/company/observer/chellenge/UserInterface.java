package com.company.observer.chellenge;

public class UserInterface implements WeatherObserver {
    private double temperature;
    private double windSpeed;
    private double pressure;
    private Subject subject;

    public UserInterface(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(double temperature, double windSpeed, double pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
    }

    public void display() {
        System.out.println("Alert System:");
        System.out.println("Temperature: " + temperature + "; wind speed: " + windSpeed + "; pressure: " + pressure);
    }
}
