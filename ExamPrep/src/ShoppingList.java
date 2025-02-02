import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>products = Arrays.stream(scanner.nextLine()
                        .split("!"))
                        .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")){
            String type = command.split(" ")[0];
            String item = command.split(" ")[1];
            switch (type){
                case "Urgent":
                    if (!products.contains(item)){
                        products.add(0,item);
                    }
                    break;
                case "Unnecessary":
                    if (products.contains(item)){
                        products.remove(item);
                    }
                    break;
                case "Correct":
                    String item2 = command.split(" ")[2];
                    if (products.contains(item)){
                        products.set(products.indexOf(item),item2);
                    }
                    break;
                case "Rearrange":
                    if (products.contains(item)){
                        products.remove(item);
                        products.add(item);
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(String.join(", ",products));
    }
}
