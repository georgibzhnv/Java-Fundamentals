import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        long n1Fact = getFactorialOfNumber(n1);
        long n2Fact=  getFactorialOfNumber(n2);
        System.out.printf("%.2f",(n1Fact*1.0)/n2Fact);
    }
    public static long getFactorialOfNumber(int number){
        long fact = 1;
        for (int i = 1; i <=number ; i++) {
             fact=fact*i;
        }
        return fact;
    }
}
