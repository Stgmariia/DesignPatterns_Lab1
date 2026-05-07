package functional_patterns;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

interface Product { void info(); }
class Laptop implements Product { public void info() { System.out.println("Створено Ноутбук"); } }
class Phone implements Product { public void info() { System.out.println("Створено Телефон"); } }

public class FactoryPattern {
    private static final Map<String, Supplier<Product>> factoryMap = new HashMap<>();

    static {
        // Реєструємо посилання на конструктори
        factoryMap.put("laptop", Laptop::new);
        factoryMap.put("phone", Phone::new);
    }

    public static Product createProduct(String type) {
        Supplier<Product> product = factoryMap.get(type.toLowerCase());
        if (product != null) return product.get();
        throw new IllegalArgumentException("Невідомий тип продукту");
    }

    public static void main(String[] args) {
        Product myLaptop = createProduct("laptop");
        myLaptop.info();
    }
}