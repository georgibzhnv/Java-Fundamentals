import java.util.Scanner;
import java.util.function.DoubleFunction;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int bitcoin = 0;
        String[] rooms = scanner.nextLine().split("\\|");
        boolean isAlive = true;

        for (int i = 0; i < rooms.length; i++) {
            String room = rooms[i];
            String[] roomArgs = room.split(" ");
            String command = roomArgs[0];
            int value = Integer.parseInt(roomArgs[1]);

            switch (command) {
                case "potion":
                    int healthBeforePotion = health;
                    health += value;
                    if (health > 100) {
                        health = 100;
                    }
                    System.out.printf("You healed for %d hp.%n", health - healthBeforePotion);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitcoin += value;
                    System.out.printf("You found %d bitcoins.%n",value);
                    break;
                default:
                    health -= value;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i + 1);
                        isAlive = false;
                    }
                    break;
            }
            if (!isAlive) {
                break;
            }
        }
        if (isAlive) {
            System.out.printf("You've made it!%n");
            System.out.printf("Bitcoins: %d%n", bitcoin);
            System.out.printf("Health: %d%n", health);
        }
    }
}