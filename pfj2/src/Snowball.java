import java.util.Scanner;

public class Snowball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        double maxValue = Double.MIN_VALUE;
        int maxSnow = 0;
        int maxTime = 0;
        int maxQuality = 0;
        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow/snowballTime),snowballQuality);
            if (snowballValue>maxValue) {
                maxValue = snowballValue;
                maxSnow = snowballSnow;
                maxQuality =snowballQuality;
                maxTime = snowballTime;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnow,maxTime,maxValue,maxQuality);
    }
}
