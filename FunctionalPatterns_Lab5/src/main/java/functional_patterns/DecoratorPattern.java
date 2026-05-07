package functional_patterns;

import java.util.function.Function;

public class DecoratorPattern {
    public static void main(String[] args) {
        // Базова функція
        Function<String, String> baseService = text -> "Дані: " + text;

        // Додаємо декоратори через композицію функцій
        Function<String, String> loggerDecorator = text -> "[LOG] " + text;
        Function<String, String> timestampDecorator = text -> text + " (Час: 16:00)";

        // Ланцюжок декораторів
        Function<String, String> fullService = baseService
                .andThen(loggerDecorator)
                .andThen(timestampDecorator);

        System.out.println(fullService.apply("Запит до БД"));
    }
}