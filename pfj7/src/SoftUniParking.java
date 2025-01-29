import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String>parkingData = new LinkedHashMap<>();

        int countCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=countCommands ; i++) {
            String command = scanner.nextLine();
            String[] commandArgs = command.split(" ");
            String commandName = commandArgs[0];
            String username = commandArgs[1];

            switch (commandName){
                case "register":
                    String carNumber = commandArgs[2];
                    if (parkingData.containsKey(username)){
                        System.out.printf("ERROR: already registered with plate number %s%n",parkingData.get(username));
                    }else {
                        parkingData.put(username,carNumber);
                        System.out.printf("%s registered %s successfully%n",username,carNumber);
                    }
                    break;
                case "unregister":
                    if (!parkingData.containsKey(username)){
                        System.out.printf("ERROR: user %s not found%n",username);
                    }else {
                       parkingData.remove(username);
                        System.out.printf("%s unregistered successfully%n",username);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry :parkingData.entrySet()) {
            System.out.println(entry.getKey()+ " => "+entry.getValue());
        }

    }
}
