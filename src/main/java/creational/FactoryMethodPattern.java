package creational;

public class FactoryMethodPattern {
    public interface Car { void drive(); }

    public static class Sedan implements Car {
        public void drive() { System.out.println("Factory Method: Їдемо на седані."); }
    }

    public static class Truck implements Car {
        public void drive() { System.out.println("Factory Method: Вантажівка везе товар."); }
    }

    public abstract static class CarFactory {
        public abstract Car createCar();
    }

    public static class SedanFactory extends CarFactory {
        public Car createCar() { return new Sedan(); }
    }
}