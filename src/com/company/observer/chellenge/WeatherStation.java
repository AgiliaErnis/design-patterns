package com.company.observer.chellenge;

import java.util.ArrayList;

public class WeatherStation implements Subject{
    private double temperature;
    private double windSpeed;

    public double getTemperature() {
        return temperature;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getPressure() {
        return pressure;
    }

    private double pressure;

    ArrayList<WeatherObserver> weatherObservers;

    public WeatherStation(){
        weatherObservers = new ArrayList<>();
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
        notifyObserver();
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        notifyObserver();
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        weatherObservers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        weatherObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (WeatherObserver observer : weatherObservers) {
            observer.update(temperature, windSpeed, pressure);
        }
    }
}
