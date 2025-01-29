import java.math.BigInteger;
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        StringBuilder result = new StringBuilder();
        int over =0;

        for (int i = firstNumber.length()-1; i >=0 ; i--) {
            int digit = Integer.parseInt(firstNumber.charAt(i)+"");
            int product = digit*secondNumber+over;

            over = product/10;
            result.insert(0,product%10);
        }
        System.out.println(result);


    }
}
