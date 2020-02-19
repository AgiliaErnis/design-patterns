package com.company.observer;

public class ConcreteObserver implements Observer{
    private int value;
    private Subject subject;

    public ConcreteObserver(Subject subject){
        this.subject = subject;
        update(subject.getValue());
        subject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}
