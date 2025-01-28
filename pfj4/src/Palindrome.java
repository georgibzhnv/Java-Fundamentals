import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            System.out.println(checkPalindrome(command));

            command =scanner.nextLine();
        }
    }
    public static boolean checkPalindrome(String number){
        String reversedText = "";
        for (int i = number.length()-1; i >=0 ; i--) {
            reversedText+=number.charAt(i);
        }
        return number.equals(reversedText);
    }
}
