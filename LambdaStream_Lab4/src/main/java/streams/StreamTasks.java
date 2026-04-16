package streams;

import java.util.*;
import java.util.stream.*;

public class StreamTasks {

    // 1. Використовуючи лямбда-вираз, відфільтрувати непарні числа зі списку цілих чисел
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
    }

    // 2. Використовуючи лямбда-вираз, знайти середнє зі списку дійсних значень
    public static double findAverage(List<Double> numbers) {
        return numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    // 3. Використовуючи лямбда-вираз для сортування списку рядків в алфавітному порядку
    public static List<String> sortAlphabetically(List<String> strings) {
        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    // 4. Використовуючи лямбда-вираз для обчислення суми всіх парних чисел
    public static int sumEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    // 5. Використовуючи лямбда-вираз, обчислити факторіал заданого числа
    public static long calculateFactorial(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        return LongStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }

    // 6. За допомогою лямбда-виразу розрахуйте множення та підсумовування всіх елементів у списку цілих чисел
    public static void multiplyAndSum(List<Integer> numbers) {
        int sum = numbers.stream().reduce(0, Integer::sum);
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Сума: " + sum + ", Добуток: " + product);
    }

    // 7. За допомогою лямбда-виразу, розрахуйте квадрат кожного числа у списку цілих чисел
    public static List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    // 8. Використовуючи лямбда-вираз для сортування рядків на основі їх довжини в порядку зростання
    public static List<String> sortByLength(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    // 9. За допомогою лямбда-виразу підрахуйте кількість слів у реченні (слова розділені пробілами)
    public static long countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) return 0;
        return Arrays.stream(sentence.trim().split("\\s+"))
                .count();
    }

    // 10. Використовуючи лямбда-вираз, знайти перший непорожній рядок у списку рядків
    public static Optional<String> findFirstNotEmpty(List<String> strings) {
        return strings.stream()
                .filter(s -> s != null && !s.trim().isEmpty())
                .findFirst();
    }

    // 11. За допомогою лямбда-виразу, перевірити, чи всі рядки у списку починаються з великої літери
    public static boolean allStartWithUpperCase(List<String> strings) {
        return strings.stream()
                .allMatch(s -> s != null && !s.isEmpty() && Character.isUpperCase(s.charAt(0)));
    }

    // 12. Використовуючи лямбда-вираз, знайти друге за величиною число в списку цілих чисел
    public static Optional<Integer> findSecondLargest(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
    }

    // 13. Використовуючи лямбда-вираз, знайти найбільше парне число в списку цілих чисел
    public static Optional<Integer> findMaxEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compare);
    }
}