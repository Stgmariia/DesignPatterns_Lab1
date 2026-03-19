package creational;
import java.util.*;

public class ObjectPoolPattern {
    public static class CarRentalPool {
        private List<String> available = new ArrayList<>(Arrays.asList("Audi", "BMW"));

        public String acquireCar() {
            return available.isEmpty() ? null : available.remove(1);
        }

        public void releaseCar(String car) {
            available.add(car);
        }
    }
}
