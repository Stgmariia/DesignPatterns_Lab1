package behavioral;

interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}

class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

interface ComputerPartVisitor {
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}

class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Відображення Клавіатури.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Відображення Монітора.");
    }
}

public class VisitorPattern {
    public static void show() {
        System.out.println("--- Демонстрація патерна Відвідувач ---");
        ComputerPart keyboard = new Keyboard();
        ComputerPart monitor = new Monitor();

        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();

        keyboard.accept(visitor);
        monitor.accept(visitor);
    }
}