import java.util.Scanner;
import java.util.regex.Matcher;

public class Hunting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());

        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerPlayer = Double.parseDouble(scanner.nextLine());
        double foodPerPlayer = Double.parseDouble(scanner.nextLine());

        double allWater = players*waterPerPlayer*days;
        double allFood = players*foodPerPlayer*days;

        for (int i = 1; i <=days ; i++) {
            double energyLoss = Double.parseDouble(scanner.nextLine());
            energy-=energyLoss;

            if (energy<=0){
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.%n", allFood,allWater);
                return;
            }
            if (i%2==0){
                double currentEnergy = energy*0.05;
                double currentWater = allWater*0.3;
                allWater -= currentWater;
                energy+=currentEnergy;
            }
            if (i%3==0){
                double currentEnergy = energy*0.1;
                double currentFood = allFood/players;
                allFood -= currentFood;
                energy+=currentEnergy;
            }
        }
        System.out.printf("You are ready for the quest. You will be left with - %.2f energy!%n",energy);
    }
}
