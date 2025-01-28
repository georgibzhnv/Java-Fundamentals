import java.util.Scanner;

public class Padwan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());
        double totalMoney = ((countOfStudents-countOfStudents/6)*priceBelts)+(priceRobe*countOfStudents)+(priceSaber*Math.ceil(countOfStudents*1.1));
        if (money>=totalMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",totalMoney);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",totalMoney-money);
        }
    }
}
