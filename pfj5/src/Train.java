import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>wagons = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.contains("Add")) {
                int numberForAdd = Integer.parseInt(command.split(" ")[1]);
                wagons.add(numberForAdd);
            }else {
                int passengersCount = Integer.parseInt(command);
                for (int i = 0; i <=wagons.size()-1; i++) {
                    int passengersPerWagon = wagons.get(i);
                    if (passengersPerWagon+passengersCount<=capacity){
                        wagons.set(i,passengersPerWagon+passengersCount);
                        break;
                    }
                }
            }


            command= scanner.nextLine();
        }
        for (int wagon: wagons){
            System.out.print(wagon + " ");
        }
    }
}
