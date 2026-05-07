package functional_patterns;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. ПАТЕРН СТРАТЕГІЯ ===");
        StrategyPattern.main(args);

        System.out.println("\n=== 2. ФАБРИЧНИЙ МЕТОД ===");
        FactoryPattern.main(args);

        System.out.println("\n=== 3. ПАТЕРН ДЕКОРАТОР ===");
        DecoratorPattern.main(args);

        System.out.println("\n=== 4. EXECUTE AROUND ===");
        ExecuteAroundPattern.main(args);
    }
}