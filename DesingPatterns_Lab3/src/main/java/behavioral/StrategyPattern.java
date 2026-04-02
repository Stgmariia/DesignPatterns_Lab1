package behavioral;

interface Strategy {
    int doOperation(int num1, int num2);
}

class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

class ContextStrategy {
    private Strategy strategy;

    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}

public class StrategyPattern {
    public static void show() {
        System.out.println("--- Демонстрація патерна Стратегія ---");

        ContextStrategy context = new ContextStrategy(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new ContextStrategy(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}