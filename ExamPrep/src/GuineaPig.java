import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foodInKg = Double.parseDouble(scanner.nextLine());
        double hayInKg = Double.parseDouble(scanner.nextLine());
        double coverInKg = Double.parseDouble(scanner.nextLine());
        double weightInKg = Double.parseDouble(scanner.nextLine());

        double foodInG = (foodInKg * 1000);
        double hayInG = (hayInKg * 1000);
        double coverInG = (coverInKg * 1000);
        double weightInG = (weightInKg * 1000);

        for (int day = 1; day <= 30; day++) {
            foodInG -= 300;
            if (day % 2 == 0) {
                double neededHay = 0.05 * foodInG;
                hayInG -= neededHay;
            }
            if (day % 3 == 0) {
                double neededCover = weightInG/3;
                coverInG -= neededCover;
            }
            if (foodInG <= 0 || hayInG <= 0 || coverInG <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodInG/1000,hayInG/1000,coverInG/1000);
    }
}
