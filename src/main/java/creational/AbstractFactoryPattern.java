package creational;

public class AbstractFactoryPattern {
    public interface Engine { String getInfo(); }
    public interface Tire { String getInfo(); }

    public static class ElectricEngine implements Engine {
        public String getInfo() { return "Електродвигун"; }
    }

    public static class EcoTire implements Tire {
        public String getInfo() { return "Еко-шини"; }
    }

    public interface CarPartsFactory {
        Engine createEngine();
        Tire createTire();
    }

    public static class TeslaFactory implements CarPartsFactory {
        public Engine createEngine() { return new ElectricEngine(); }
        public Tire createTire() { return new EcoTire(); }
    }
}