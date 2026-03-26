package creational;

import structural.*;

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




System.out.println("\n=== ЛАБОРАТОРНА РОБОТА №2: СТРУКТУРНІ ПАТЕРНИ ===\n");

// 1. Adapter
AdapterPattern.OldHorseCart oldCart = new AdapterPattern.ClassicCart();
AdapterPattern.ModernTransport adaptedCart = new AdapterPattern.CartAdapter(oldCart);
        adaptedCart.drive();

// 2. Bridge
BridgePattern.Vehicle sportCar = new BridgePattern.SportCar(new BridgePattern.AIControl());
        sportCar.drive();

// 3. Composite
CompositePattern.Fleet myFleet = new CompositePattern.Fleet();
        myFleet.addVehicle(new CompositePattern.DeliveryVan("V-01"));
        myFleet.addVehicle(new CompositePattern.DeliveryVan("V-02"));
        myFleet.showStatus();

// 4. Decorator
DecoratorPattern.Serviceable decoratedCar = new DecoratorPattern.BasicCar();
        decoratedCar = new DecoratorPattern.GPSDecorator(decoratedCar);
        System.out.println("Decorator: " + decoratedCar.getDescription() + ", Ціна: " + decoratedCar.getCost());

// 5. Facade
FacadePattern.CarFacade carFacade = new FacadePattern.CarFacade();
        carFacade.startJourney();

// 6. Flyweight
FlyweightPattern.CarType type1 = FlyweightPattern.CarFactory.getCarType("Tesla");
        type1.display(10, 20);
FlyweightPattern.CarType type2 = FlyweightPattern.CarFactory.getCarType("Tesla"); // Має взяти вже існуючий
        type2.display(30, 40);

// 7. Proxy
ProxyPattern.Drivable proxyCar = new ProxyPattern.CarProxy("Ferrari", "B123");
        proxyCar.drive();
    }
            }