import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int messages = Integer.parseInt(scanner.nextLine());
        List<String>attackPlanets = new ArrayList<>();
        List<String>destructionPlanets = new ArrayList<>();
        Pattern pattern = Pattern.compile("@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<population>[0-9]+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldiers>[0-9]+)");

        for (int i = 1; i <= messages; i++) {
            String input = scanner.nextLine();
            String decryptedMessage = getDecryptedMessage(input);
            Matcher matcher = pattern.matcher(decryptedMessage);
            if (matcher.find()){
                String planetName = matcher.group("planetName");
                String attackType =matcher.group("attackType");
                if (attackType.equals("A")){
                    attackPlanets.add(planetName);
                } else if (attackType.equals("D")) {
                    destructionPlanets.add(planetName);
                }
            }
        }
        System.out.println("Attacked planets: "+attackPlanets.size());
        Collections.sort(attackPlanets);
        attackPlanets.forEach(planet-> System.out.println("-> "+planet));

        System.out.println("Destroyed planets: "+ destructionPlanets.size());
        Collections.sort(destructionPlanets);
        destructionPlanets.forEach(planet -> System.out.println("-> "+planet));
    }

    private static String getDecryptedMessage(String input) {
        int count = getSpecialLettersCount(input);
        StringBuilder decryptedMessage = new StringBuilder();
        for (char symbol:input.toCharArray()) {
            char newSymbol =(char)(symbol-count);
            decryptedMessage.append(newSymbol);
        }
        return decryptedMessage.toString();
    }

    private static int getSpecialLettersCount(String input) {
        int count=0;
        for (char symbol:input.toCharArray()) {
            switch (symbol){
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }
        return count;
    }
}
