package groomingSalon;

import groomingSalon.GroomingSalon;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroomingSalon salon = new GroomingSalon(20);


        Pet dog = new Pet("Ellias", 5, "Tim");

        System.out.println(dog);

        salon.add(dog);

        System.out.println(salon.remove("Ellias")); // true
        System.out.println(salon.remove("Pufa")); // false

        Pet cat = new Pet("Bella", 2, "Mia");
        Pet bunny = new Pet("Zak", 4, "Jon");

        salon.add(cat);
        salon.add(bunny);

        Pet pet = salon.getPet("Bella", "Mia");
        System.out.println(pet); // Bella 2 - (Mia)

        System.out.println(salon.getCount()); // 2

        System.out.println(salon.getStatistics());
    }
}