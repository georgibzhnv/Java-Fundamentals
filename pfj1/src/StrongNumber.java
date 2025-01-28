import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int fact_n, lastdig;
        int number = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int temp_n = number;
        while (number != 0) {
            i = 1;
            fact_n = 1;
            lastdig = number % 10;
            while (i <= lastdig) {
                fact_n = fact_n * i;
                i++;
            }
            total = total + fact_n;
            number = number / 10;
        }
        if (total == temp_n) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}