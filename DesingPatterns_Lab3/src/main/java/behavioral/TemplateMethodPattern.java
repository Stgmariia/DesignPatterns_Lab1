package behavioral;

abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // Шаблонний метод
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}

class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Футбольна гра: Ініціалізація...");
    }

    @Override
    void startPlay() {
        System.out.println("Футбольна гра: Розпочато. Насолоджуйтесь грою!");
    }

    @Override
    void endPlay() {
        System.out.println("Футбольна гра: Завершено!");
    }
}

public class TemplateMethodPattern {
    public static void show() {
        System.out.println("--- Демонстрація патерна Шаблонний метод ---");
        Game game = new Football();
        game.play();
    }
}