import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String,Integer>cityToPop = new LinkedHashMap<>();
        LinkedHashMap<String,Integer>cityToGold = new LinkedHashMap<>();

        while (!input.equals("Sail")){
            String[] cityArgs = input.split("\\|\\|");
            String city = cityArgs[0];
            int population = Integer.parseInt(cityArgs[1]);
            int gold = Integer.parseInt(cityArgs[2]);
            if (!cityToPop.containsKey(city)&&!cityToGold.containsKey(city)){
                cityToPop.put(city,population);
                cityToGold.put(city,gold);
            }else {
                cityToPop.put(city,cityToPop.get(city)+population);
                cityToGold.put(city,cityToGold.get(city)+gold);
            }
            input= scanner.nextLine();
        }
        String events = scanner.nextLine();
        while (!events.equals("End")){
            String []commandArgs = events.split("=>");
            String command = commandArgs[0];
            String town = commandArgs[1];
            switch (command){
                case "Plunder":
                    int people = Integer.parseInt(commandArgs[2]);
                    int gold = Integer.parseInt(commandArgs[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,gold,people);
                    cityToPop.put(town,cityToPop.get(town)-people);
                    cityToGold.put(town,cityToGold.get(town)-gold);
                    if (cityToPop.get(town)<=0 || cityToGold.get(town)<=0){
                        cityToPop.remove(town);
                        cityToGold.remove(town);
                        System.out.printf("%s has been wiped off the map!%n",town);
                    }
                    break;
                case "Prosper":
                    int earnedGold = Integer.parseInt(commandArgs[2]);
                    if (earnedGold<=0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else {
                        cityToGold.put(town,cityToGold.get(town)+earnedGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",earnedGold,town,cityToGold.get(town));
                    }
                    break;
            }
            events= scanner.nextLine();
        }
        int countOfTowns = cityToPop.size();
        if (countOfTowns>0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", countOfTowns);
            for (Map.Entry<String, Integer> entry : cityToPop.entrySet()) {
                String town = entry.getKey();
                int population = entry.getValue();
                int gold = cityToGold.get(town);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", town, population, gold);
            }
        }else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
