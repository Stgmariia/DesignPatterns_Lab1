package behavioral;

import java.util.ArrayList;
import java.util.List;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Двійковий рядок: " + Integer.toBinaryString(subject.getState()));
    }
}

class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Шістнадцятковий рядок: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}

public class ObserverPattern {
    public static void show() {
        Subject subject = new Subject();

        new HexObserver(subject);
        new BinaryObserver(subject);

        System.out.println("--- Демонстрація патерна Спостерігач ---");
        System.out.println("Зміна стану на 15:");
        subject.setState(15);
        System.out.println("Зміна стану на 10:");
        subject.setState(10);
    }
}