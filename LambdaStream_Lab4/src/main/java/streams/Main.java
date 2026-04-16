package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("   LABORATORY WORK #4: LAMBDA & STREAM API");
        System.out.println("====================================================\n");

        // Підготовка тестових даних
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Double> doubleList = Arrays.asList(10.5, 20.0, 30.5, 40.0);
        List<String> stringList = Arrays.asList("Apple", "Banana", "", "Cherry", "date", "Eggplant");
        String sentence = "Java Stream API is very powerful";

        // 1. Відфільтрувати непарні числа
        System.out.println("1. Непарні числа: " + StreamTasks.filterOddNumbers(intList));

        // 2. Середнє значення
        System.out.println("2. Середнє значення: " + StreamTasks.findAverage(doubleList));

        // 3. Сортування в алфавітному порядку
        System.out.println("3. Алфавітний порядок: " + StreamTasks.sortAlphabetically(stringList));

        // 4. Сума всіх парних чисел
        System.out.println("4. Сума парних чисел: " + StreamTasks.sumEvenNumbers(intList));

        // 5. Факторіал
        int n = 5;
        System.out.println("5. Факторіал числа " + n + ": " + StreamTasks.calculateFactorial(n));

        // 6. Множення та підсумовування
        System.out.print("6. Результати: ");
        StreamTasks.multiplyAndSum(intList);

        // 7. Квадрат кожного числа
        System.out.println("7. Квадрати чисел: " + StreamTasks.squareNumbers(Arrays.asList(1, 2, 3, 4, 5)));

        // 8. Сортування за довжиною рядка
        System.out.println("8. Сортування за довжиною: " + StreamTasks.sortByLength(stringList));

        // 9. Кількість слів у реченні
        System.out.println("9. Кількість слів у реченні: " + StreamTasks.countWords(sentence));

        // 10. Перший непорожній рядок
        System.out.println("10. Перший непорожній рядок: " + StreamTasks.findFirstNotEmpty(stringList).orElse("Не знайдено"));

        // 11. Чи всі рядки з великої літери
        List<String> upperCaseList = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println("11. Чи всі з великої літери: " + StreamTasks.allStartWithUpperCase(upperCaseList));

        // 12. Друге за величиною число
        System.out.println("12. Друге за величиною число: " + StreamTasks.findSecondLargest(intList).orElse(-1));

        // 13. Найбільше парне число
        System.out.println("13. Найбільше парне число: " + StreamTasks.findMaxEven(intList).orElse(-1));

        System.out.println("\n====================================================");
    }
}