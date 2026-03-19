package creational;

public class SingletonPattern {
    public static class CarFactoryAdmin {
        private static volatile CarFactoryAdmin instance;

        private CarFactoryAdmin() {}

        public static CarFactoryAdmin getInstance() {
            if (instance == null) {
                synchronized (CarFactoryAdmin.class) {
                    if (instance == null) {
                        instance = new CarFactoryAdmin();
                    }
                }
            }
            return instance;
        }

        public void manage() {
            System.out.println("Singleton: Адміністратор керує заводом.");
        }
    }
}