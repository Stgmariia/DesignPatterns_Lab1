package structural;

public class BridgePattern {
    // Реалізація (Implementation)
    public interface ControlSystem {
        void operate();
    }

    // Конкретні реалізації
    public static class ManualControl implements ControlSystem {
        public void operate() { System.out.print("Bridge: Ручне керування."); }
    }

    public static class AIControl implements ControlSystem {
        public void operate() { System.out.print("Bridge: Автопілот."); }
    }

    // Абстракція (Abstraction)
    public abstract static class Vehicle {
        protected ControlSystem control;

        protected Vehicle(ControlSystem control) {
            this.control = control;
        }

        public abstract void drive();
    }

    // Розширена абстракція
    public static class SportCar extends Vehicle {
        public SportCar(ControlSystem control) {
            super(control);
        }

        @Override
        public void drive() {
            control.operate();
            System.out.println(" Спортивне авто на трасі.");
        }
    }
}