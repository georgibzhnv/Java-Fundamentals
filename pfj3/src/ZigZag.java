import java.sql.SQLOutput;
import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 1; i <=n; i++) {
            String input = scanner.nextLine();
            String [] numbers = input.split(" ");
            int number1 = Integer.parseInt(numbers[0]);
            int number2 = Integer.parseInt(numbers[1]);
            if (i%2!=0){
                firstArray[i-1]=number1;
                secondArray[i-1]=number2;
            }else {
                firstArray[i-1]=number2;
                secondArray[i-1]=number1;
            }
        }
        for (int numbers:firstArray
             ) {
            System.out.print(numbers+" ");
        }
        System.out.println();
        for (int numbers:secondArray
             ) {
            System.out.print(numbers+" ");
        }
    }
}
