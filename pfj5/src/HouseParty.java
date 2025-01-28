import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<String>guests = new ArrayList<>();
        while (number>0){
            String command = scanner.nextLine();
            if (command.contains("is going!")){
                String nameOfGuest = command.split(" ")[0];
                if (!guests.contains(nameOfGuest)){
                    guests.add(nameOfGuest);
                }else {
                    System.out.printf("%s is already in the list!%n",nameOfGuest);
                }
            } else if (command.contains("is not going!")) {
                String nameOfGuest = command.split(" ")[0];
                if (guests.contains(nameOfGuest)){
                    guests.remove(nameOfGuest);
                }else {
                    System.out.printf("%s is not in the list!%n",nameOfGuest);
                }
            }
            number--;
        }
        for (String names: guests) {
            System.out.println(names);
        }
    }
}
