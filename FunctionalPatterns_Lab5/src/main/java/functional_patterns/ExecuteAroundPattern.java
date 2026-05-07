package functional_patterns;

import java.util.function.Consumer;

class DatabaseConnection {
    private DatabaseConnection() { System.out.println("З'єднання з БД відкрите..."); }

    public void query(String sql) { System.out.println("Виконуємо запит: " + sql); }

    private void close() { System.out.println("З'єднання закрите."); }

    // Метод, що реалізує Execute Around
    public static void handle(Consumer<DatabaseConnection> block) {
        DatabaseConnection connection = new DatabaseConnection();
        try {
            block.accept(connection);
        } finally {
            connection.close();
        }
    }
}

public class ExecuteAroundPattern {
    public static void main(String[] args) {
        // Ми просто передаємо те, що хочемо зробити "всередині" з'єднання
        DatabaseConnection.handle(db -> db.query("SELECT * FROM users"));
    }
}