import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[]word = input.split("");
        getCountOfVowels(word);
    }

    public static void getCountOfVowels(String[] word){
        int sum= 0;
        for (int i = 0; i <= word.length-1; i++) {
            String currentLetter = word[i];

            switch (currentLetter.toLowerCase()){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "y":
                    sum++;
                    break;
            }
        }
        System.out.println(sum);

    }
}
