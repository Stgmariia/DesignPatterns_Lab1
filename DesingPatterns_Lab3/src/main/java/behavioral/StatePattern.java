package behavioral;

interface State {
    void doAction(Context context);
}

class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Гра в стані запуску");
        context.setState(this);
    }

    public String toString() {
        return "Стан Запуску";
    }
}

class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Гра в стані зупинки");
        context.setState(this);
    }

    public String toString() {
        return "Стан Зупинки";
    }
}

class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

public class StatePattern {
    public static void show() {
        Context context = new Context();

        System.out.println("--- Демонстрація патерна Стан ---");
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}