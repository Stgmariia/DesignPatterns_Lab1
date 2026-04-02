package behavioral;

import java.util.ArrayList;
import java.util.List;

class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}

class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}

public class MementoPattern {
    public static void show() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        System.out.println("--- Демонстрація патерна Знімок ---");
        originator.setState("Стан #1");
        originator.setState("Стан #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("Стан #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("Стан #4");
        System.out.println("Поточний стан: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("Перший збережений стан: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Другий збережений стан: " + originator.getState());
    }
}