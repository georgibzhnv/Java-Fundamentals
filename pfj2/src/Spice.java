import java.util.Scanner;

public class Spice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int total = 0;

        while (yield>=100){
            days++;
            int spice = yield -26;
            total+=spice;

            yield -=10;
        }
        total=total-26;

        if (total<0){
            total =0;
        }
        System.out.println(days);
        System.out.println(total);
    }
}
