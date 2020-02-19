package com.company.observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{
    private ArrayList<Observer> observers;
    private int value = 0;

    public int getValue() {
        return value;
    }

    public ConcreteSubject(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }

    @Override
    public void notifyObserver(){
        for (Observer observer : observers) {
            observer.update(value);
        }
    }
}
