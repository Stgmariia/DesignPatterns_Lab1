package creational;

public class BuilderPattern {
    public static class CustomCar {
        private String model;
        private String color;
        private boolean hasSunroof;

        public void setModel(String model) { this.model = model; }
        public void setColor(String color) { this.color = color; }
        public void setHasSunroof(boolean hasSunroof) { this.hasSunroof = hasSunroof; }

        @Override
        public String toString() {
            return "Builder: " + model + " (" + color + ")" + (hasSunroof ? " з люком" : "");
        }
    }

    public static class CarBuilder {
        private CustomCar car = new CustomCar();
        public CarBuilder setModel(String model) { car.setModel(model); return this; }
        public CarBuilder setColor(String color) { car.setColor(color); return this; }
        public CarBuilder addSunroof() { car.setHasSunroof(true); return this; }
        public CustomCar build() { return car; }
    }
}