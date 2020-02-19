package com.company.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver(concreteSubject);

        concreteSubject.setValue(99);
        System.out.println("Value was set to 99.");
        concreteObserver.display();
        concreteSubject.setValue(22);
        System.out.println("Value was set to 22.");
        concreteObserver.display();

        ConcreteObserver concreteObserver1 = new ConcreteObserver(concreteSubject);
        System.out.println("Value of the subject from a new observer:");
        concreteObserver1.display();
    }
}
