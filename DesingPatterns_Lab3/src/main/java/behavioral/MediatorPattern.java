package behavioral;

import java.util.Date;

class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}

class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}

public class MediatorPattern {
    public static void show() {
        User robert = new User("Роберт");
        User john = new User("Джон");

        System.out.println("--- Демонстрація патерна Посередник ---");
        robert.sendMessage("Привіт, Джоне!");
        john.sendMessage("Вітаю, Роберте!");
    }
}