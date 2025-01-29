import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Miner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String,Integer>result = new LinkedHashMap<>();
        while (!command.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!result.containsKey(command)){
                result.put(command,quantity);
            }else {
                int currentCount = result.get(command);
                result.put(command,currentCount+quantity);
            }
            command= scanner.nextLine();
        }
        for (Map.Entry<String,Integer>kvp: result.entrySet()) {
            System.out.println(kvp.getKey()+ " -> " +kvp.getValue());
        }
    }
}
