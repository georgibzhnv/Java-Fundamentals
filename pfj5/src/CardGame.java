import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>firstDeck = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer>secondDeck = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int sum= 0;

        while (firstDeck.size()!=0 && secondDeck.size()!=0) {
                int firstDeckCard = firstDeck.get(0);
                int secondDeckCard = secondDeck.get(0);
                firstDeck.remove(0);
                secondDeck.remove(0);
                if (firstDeckCard > secondDeckCard) {
                    firstDeck.add(firstDeckCard);
                    firstDeck.add(secondDeckCard);
                } else if (secondDeckCard > firstDeckCard) {
                    secondDeck.add(secondDeckCard);
                    secondDeck.add(firstDeckCard);
            }
        }
        if (secondDeck.size()==0){
            System.out.print("First player wins! ");
            for (int card:firstDeck) {
                sum+=card;
            }
            System.out.printf("Sum: %d", sum);
        }else if (firstDeck.size()==0){
            System.out.print("Second player wins! ");
            for (int card:secondDeck) {
                sum+=card;
            }
            System.out.printf("Sum: %d", sum);
        }
    }
}
