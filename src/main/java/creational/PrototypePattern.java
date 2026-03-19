package creational;

public class PrototypePattern {
    public abstract static class CarPrototype implements Cloneable {
        protected String id;
        public void setId(String id) { this.id = id; }
        public abstract void show();

        @Override
        public CarPrototype clone() throws CloneNotSupportedException {
            return (CarPrototype) super.clone();
        }
    }

    public static class ExhibitionCar extends CarPrototype {
        public void show() { System.out.println("Prototype: Клон авто з ID " + id); }
    }
}