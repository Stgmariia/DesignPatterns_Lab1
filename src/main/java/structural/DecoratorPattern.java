package structural;

public class DecoratorPattern {
    // Базовий інтерфейс
    public interface Serviceable {
        String getDescription();
        double getCost();
    }

    // Конкретний об'єкт (базова комплектація)
    public static class BasicCar implements Serviceable {
        @Override
        public String getDescription() { return "Базове авто"; }
        @Override
        public double getCost() { return 20000.0; }
    }

    // Базовий декоратор
    public abstract static class CarDecorator implements Serviceable {
        protected Serviceable decoratedCar;

        public CarDecorator(Serviceable car) {
            this.decoratedCar = car;
        }

        public String getDescription() { return decoratedCar.getDescription(); }
        public double getCost() { return decoratedCar.getCost(); }
    }

    // Конкретний декоратор (додаткова опція)
    public static class GPSDecorator extends CarDecorator {
        public GPSDecorator(Serviceable car) { super(car); }

        @Override
        public String getDescription() {
            return super.getDescription() + " + GPS навігатор";
        }

        @Override
        public double getCost() {
            return super.getCost() + 500.0;
        }
    }
}