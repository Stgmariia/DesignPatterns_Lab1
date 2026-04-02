package behavioral;

public class Main {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   LABORATORY WORK #3: BEHAVIORAL PATTERNS    ");
        System.out.println("==============================================\n");

        // 1. Chain of Responsibility
        ChainOfResponsibilityPattern.show();
        System.out.println();

        // 2. Command
        CommandPattern.show();
        System.out.println();


        // 3. Iterator
        IteratorPattern.show();
         System.out.println();

        // 4. Mediator
         MediatorPattern.show();
        System.out.println();

        // 5. Memento
        MementoPattern.show();
        System.out.println();

        // 6. Observer
         ObserverPattern.show();
         System.out.println();

        // 7. State
         StatePattern.show();
         System.out.println();

        // 8. Strategy
        StrategyPattern.show();
        System.out.println();

        // 9. Template Method
        TemplateMethodPattern.show();
        System.out.println();

        // 10. Visitor
        VisitorPattern.show();
        System.out.println();

        System.out.println("==============================================");
        System.out.println("                END OF DEMO                   ");
        System.out.println("==============================================");
    }
}