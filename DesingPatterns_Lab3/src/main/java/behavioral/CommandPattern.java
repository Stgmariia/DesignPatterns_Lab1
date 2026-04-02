package behavioral;

interface Order {
    void execute();
}

class Stock {
    private String name = "Акції компанії А";
    private int quantity = 10;

    public void buy() {
        System.out.println("Акція [ Назва: " + name + ", Кількість: " + quantity + " ] куплена");
    }

    public void sell() {
        System.out.println("Акція [ Назва: " + name + ", Кількість: " + quantity + " ] продана");
    }
}

class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}

class Broker {
    public void takeOrder(Order order) {
        order.execute();
    }
}

public class CommandPattern {
    public static void show() {
        Stock abcStock = new Stock();

        BuyStock buyOrder = new BuyStock(abcStock);
        Broker broker = new Broker();

        System.out.println("--- Демонстрація патерна Команда ---");
        broker.takeOrder(buyOrder);
    }
}