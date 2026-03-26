package structural;

public class FacadePattern {
    // Складна підсистема (двигун)
    public static class Engine {
        public void start() { System.out.println("Facade: Двигун запущено."); }
        public void stop() { System.out.println("Facade: Двигун зупинено."); }
    }

    // Складна підсистема (світло)
    public static class Lights {
        public void turnOn() { System.out.println("Facade: Фари увімкнено."); }
        public void turnOff() { System.out.println("Facade: Фари вимкнено."); }
    }

    // Фасад, який ховає складність
    public static class CarFacade {
        private Engine engine = new Engine();
        private Lights lights = new Lights();

        public void startJourney() {
            System.out.println("Facade: Готуємося до поїздки...");
            lights.turnOn();
            engine.start();
        }

        public void endJourney() {
            engine.stop();
            lights.turnOff();
            System.out.println("Facade: Поїздку завершено.");
        }
    }
}