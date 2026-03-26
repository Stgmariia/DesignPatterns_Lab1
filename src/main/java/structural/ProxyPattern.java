package structural;

public class ProxyPattern {
    // Спільний інтерфейс
    public interface Drivable {
        void drive();
    }

    // Реальний об'єкт (важкий або конфіденційний)
    public static class RealSuperCar implements Drivable {
        private String model;
        public RealSuperCar(String model) { this.model = model; }

        @Override
        public void drive() {
            System.out.println("Proxy: Суперкар " + model + " мчить по трасі!");
        }
    }

    // Проксі (Замісник)
    public static class CarProxy implements Drivable {
        private RealSuperCar realCar;
        private String driverLicense;

        public CarProxy(String model, String license) {
            this.realCar = new RealSuperCar(model);
            this.driverLicense = license;
        }

        @Override
        public void drive() {
            if ("B123".equals(driverLicense)) {
                System.out.println("Proxy: Права підтверджено.");
                realCar.drive();
            } else {
                System.out.println("Proxy: Доступ заборонено! Відсутня категорія прав.");
            }
        }
    }
}