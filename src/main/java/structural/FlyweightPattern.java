package structural;
import java.util.*;

public class FlyweightPattern {
    // Внутрішній стан (те, що спільне для багатьох об'єктів)
    public interface CarType {
        void display(int x, int y); // x, y — це зовнішній стан (координати)
    }

    // Конкретний легковик (Shared object)
    public static class SharedCarType implements CarType {
        private String brand;
        public SharedCarType(String brand) { this.brand = brand; }

        @Override
        public void display(int x, int y) {
            System.out.println("Flyweight: Відображення " + brand + " в точці (" + x + "," + y + ")");
        }
    }

    // Фабрика, яка керує "легковаговиками"
    public static class CarFactory {
        private static Map<String, CarType> carTypes = new HashMap<>();

        public static CarType getCarType(String brand) {
            if (!carTypes.containsKey(brand)) {
                carTypes.put(brand, new SharedCarType(brand));
                System.out.println("Flyweight: Створення нового типу для " + brand);
            }
            return carTypes.get(brand);
        }
    }
}