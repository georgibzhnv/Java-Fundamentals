import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command  = scanner.nextLine();
        double sum = 0;
        double price = 0;
        while (!command.equals("Start")){
            double money = Double.parseDouble(command);
            if (money == 0.1){
                sum+=money;
            } else if (money==0.2) {
                sum+=money;
            } else if (money==0.5) {
                sum+=money;
            }else if (money==1){
                sum+=money;
            } else if (money==2) {
                sum+=money;
            }else {
                System.out.printf("Cannot accept %.2f%n",money);
            }
            command = scanner.nextLine();
        }
        String item = scanner.nextLine();
        while (!item.equals("End")){
            switch (item){
                case "Nuts":
                    price = 2.0;
                    if (sum>=price){
                        System.out.println("Purchased Nuts");
                        sum-=price;
                    }else{
                        System.out.println("Sorry, not enough money");
                    }break;
                case "Water":
                    price = 0.7;
                    if (sum>=price){
                        System.out.println("Purchased Water");
                        sum-=price;
                    }else{
                        System.out.println("Sorry, not enough money");
                    }break;
                case "Crisps":
                    price = 1.5;
                    if (sum>=price){
                        System.out.println("Purchased Crisps");
                        sum-=price;
                    }else{
                        System.out.println("Sorry, not enough money");
                    }break;
                case "Soda":
                    price = 0.8;
                    if (sum>=price){
                        System.out.println("Purchased Soda");
                        sum-=price;
                    }else{
                        System.out.println("Sorry, not enough money");
                    }break;
                case "Coke":
                    price = 1.0;
                    if (sum>=price){
                        System.out.println("Purchased Coke");
                        sum-=price;
                    }else{
                        System.out.println("Sorry, not enough money");
                    }break;
                default:
                    System.out.println("Invalid product");
            }
            item= scanner.nextLine();
        }
        System.out.printf("Change: %.2f",sum);
    }
}
