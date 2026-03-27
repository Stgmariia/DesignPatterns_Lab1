package structural;

public class AdapterPattern {
    // Старий інтерфейс (або сторонній), який ми хочемо адаптувати
    public interface OldHorseCart {
        void moveWithHorses();
    }

    // Клас, який реалізує старий інтерфейс
    public static class ClassicCart implements OldHorseCart {
        public void moveWithHorses() {
            System.out.println("Adapter: Віз рухається за допомогою коней.");
        }
    }

    // Новий інтерфейс
    public interface ModernTransport {
        void drive();
    }

    // Адаптер, який робить старий віз сумісним з новим інтерфейсом
    public static class CartAdapter implements ModernTransport {
        private OldHorseCart cart;

        public CartAdapter(OldHorseCart cart) {
            this.cart = cart;
        }

        @Override
        public void drive() {
            cart.moveWithHorses();
        }
    }
}