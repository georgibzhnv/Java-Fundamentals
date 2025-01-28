import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (number>0){
            int i = number%10;
            sum+=i;
            number/=10;
        }
        System.out.println(sum);
    }
}
