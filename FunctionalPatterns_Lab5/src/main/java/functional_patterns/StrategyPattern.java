package functional_patterns;

import java.util.function.UnaryOperator;

public class StrategyPattern {
    public static void main(String[] args) {
        String text = "Програмування на Java - це цікаво!";

        // Визначаємо стратегії прямо через лямбди або посилання на методи
        UnaryOperator<String> toUpperCase = String::toUpperCase;
        UnaryOperator<String> toLowerCase = String::toLowerCase;
        UnaryOperator<String> removeSpaces = s -> s.replace(" ", "");

        // Використання
        System.out.println("Оригінал: " + text);
        System.out.println("Верхній регістр: " + processText(text, toUpperCase));
        System.out.println("Нижній регістр: " + processText(text, toLowerCase));
        System.out.println("Без пробілів: " + processText(text, removeSpaces));
    }

    public static String processText(String input, UnaryOperator<String> strategy) {
        return strategy.apply(input);
    }
}