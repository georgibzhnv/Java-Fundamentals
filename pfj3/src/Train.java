import java.sql.SQLOutput;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[n];
        int sum = 0;
        for (int i = 0; i <= wagons.length-1; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            wagons[i]=currentNumber;
            sum+=currentNumber;
        }
        for (int number:
             wagons) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}