package com.company.observer.chellenge;

import com.company.observer.chellenge.WeatherObserver;

public interface Subject {
    public void registerObserver(WeatherObserver observer);
    public void removeObserver(WeatherObserver observer);
    public void notifyObserver();
}
