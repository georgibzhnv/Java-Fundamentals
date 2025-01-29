import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Astra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([|#])(?<item>[A-Za-z\\s]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>[0-9]{1,5})\\1");
        Matcher matcher= pattern.matcher(input);
        int totalCalories = 0;
        StringBuilder foodsOutput = new StringBuilder();

        while (matcher.find()){
            int calories = Integer.parseInt(matcher.group("calories"));
            String item = matcher.group("item");
            String date = matcher.group("date");
            totalCalories+=calories;
            String output = String.format("Item: %s, Best before: %s, Nutrition: %d%n",item,date,calories);
            foodsOutput.append(output);
        }
        int daysToLast = totalCalories/2000;
        System.out.printf("You have food to last you for: %d days!%n",daysToLast);
        System.out.println(foodsOutput);
    }
}
