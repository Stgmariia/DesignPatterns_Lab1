package structural;
import java.util.*;

public class CompositePattern {
    // Загальний інтерфейс для компонентів (Leaf та Composite)
    public interface FleetComponent {
        void showStatus();
    }

    // Листок (Leaf) — одиничний об'єкт
    public static class DeliveryVan implements FleetComponent {
        private String id;
        public DeliveryVan(String id) { this.id = id; }

        @Override
        public void showStatus() {
            System.out.println("Composite: Фургон " + id + " готовий до виїзду.");
        }
    }

    // Композит (Composite) — контейнер, що містить інші компоненти
    public static class Fleet implements FleetComponent {
        private List<FleetComponent> vehicles = new ArrayList<>();

        public void addVehicle(FleetComponent vehicle) {
            vehicles.add(vehicle);
        }

        @Override
        public void showStatus() {
            System.out.println("Composite: Статус автопарку:");
            for (FleetComponent vehicle : vehicles) {
                vehicle.showStatus();
            }
        }
    }
}