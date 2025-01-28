import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int startPower = n;
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int count = 0;

        while (n>=m){
            n-=m;
            count++;
            if (n==startPower/2) {
                if (y !=0) {
                    n /= y;
                }
            }
        }
        System.out.println(n);
        System.out.println(count);
    }
}
