package creational;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Лабораторна робота №1: Породжувальні патерни\n");

        // 1. Singleton
        SingletonPattern.CarFactoryAdmin.getInstance().manage();

        // 2. Factory Method
        FactoryMethodPattern.CarFactory factory = new FactoryMethodPattern.SedanFactory();
        factory.createCar().drive();

        // 3. Abstract Factory
        AbstractFactoryPattern.CarPartsFactory partsFactory = new AbstractFactoryPattern.TeslaFactory();
        System.out.println("Abstract Factory: Деталі - " + partsFactory.createEngine().getInfo());

        // 4. Builder
        BuilderPattern.CustomCar myCar = new BuilderPattern.CarBuilder()
                .setModel("Porsche")
                .setColor("White")
                .addSunroof()
                .build();
        System.out.println(myCar);

        // 5. Prototype
        PrototypePattern.ExhibitionCar proto = new PrototypePattern.ExhibitionCar();
        proto.setId("001");
        PrototypePattern.ExhibitionCar clone = (PrototypePattern.ExhibitionCar) proto.clone();
        clone.show();

        // 6. Object Pool
        ObjectPoolPattern.CarRentalPool pool = new ObjectPoolPattern.CarRentalPool();
        String car = pool.acquireCar();
        System.out.println("Object Pool: Взято авто " + car);
        pool.releaseCar(car);

    }
}