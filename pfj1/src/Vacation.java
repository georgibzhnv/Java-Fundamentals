import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayType = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;

        switch (groupType) {
            case "Students":
                if (dayType.equals("Friday")) {
                    price = 8.45;
                    totalPrice = group * price;
                } else if (dayType.equals("Saturday")) {
                    price = 9.80;
                    totalPrice = group * price;
                } else if (dayType.equals("Sunday")) {
                    price = 10.46;
                    totalPrice = group * price;
                }
                if (group >= 30) {
                    totalPrice = totalPrice * 0.85;
                }
                System.out.printf("Total price: %.2f",totalPrice);
                break;
            case "Business":
                if (dayType.equals("Friday")) {
                    price = 10.90;
                    totalPrice = group * price;
                } else if (dayType.equals("Saturday")) {
                    price = 15.60;
                    totalPrice = group * price;
                } else if (dayType.equals("Sunday")) {
                    price = 16;
                    totalPrice = group * price;
                }
                if (group >= 100) {
                    totalPrice = totalPrice - 10*price;
                }
                System.out.printf("Total price: %.2f",totalPrice);
                break;
            case "Regular":
                if (dayType.equals("Friday")) {
                    price = 15;
                    totalPrice = group * price;
                } else if (dayType.equals("Saturday")) {
                    price = 20;
                    totalPrice = group * price;
                } else if (dayType.equals("Sunday")) {
                    price = 22.50;
                    totalPrice = group * price;
                }
                if (group >= 10 && group<=20) {
                    totalPrice = totalPrice * 0.95;
                }
                System.out.printf("Total price: %.2f",totalPrice);
        }
    }
}