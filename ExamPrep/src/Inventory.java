import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>items = Arrays.stream(scanner.nextLine()
                        .split(", "))
                        .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")){
            String type = command.split(" - ")[0];
            String item = command.split(" - ")[1];

            switch (type){
                case "Collect":
                    if (!items.contains(item)){
                        items.add(item);
                    }
                    break;
                case "Drop":
                    if (items.contains(item)){
                        items.remove(item);
                    }
                    break;
                case"Combine Items":
                    String oldItem = item.split(":")[0];
                    String newItem = item.split(":")[1];
                    if (items.contains(oldItem)){
                        int index = items.indexOf(oldItem);
                        items.add(index+1,newItem);
                    }
                    break;
                case "Renew":
                    if (items.contains(item)){
                        items.remove(item);
                        items.add(item);
                    }
                    break;
            }
            command= scanner.nextLine();
        }
        System.out.println(String.join(", ",items));
    }
}
