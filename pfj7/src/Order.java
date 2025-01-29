import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String,Integer>ordersList = new LinkedHashMap<>();
        LinkedHashMap<String,Double>productsPrice = new LinkedHashMap<>();
        String product = scanner.nextLine();
        while (!product.equals("buy")){
            String[] productArgs = product.split(" ");
            String name = productArgs[0];
            double price = Double.parseDouble(productArgs[1]);
            int quantity = Integer.parseInt(productArgs[2]);

            if (!ordersList.containsKey(name)){
                ordersList.put(name,quantity);
            }else {
                int currentQuantity = ordersList.get(name);
                ordersList.put(name,currentQuantity+quantity);
            }
            productsPrice.put(name,price);

            product = scanner.nextLine();
        }
        for (Map.Entry<String,Integer>kvp: ordersList.entrySet()) {
            String productName = kvp.getKey();
            double finalSum = ordersList.get(productName) * productsPrice.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
