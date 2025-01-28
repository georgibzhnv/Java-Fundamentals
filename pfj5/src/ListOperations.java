import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")){
                if (command.contains("Add")) {
                    int numberForAdd = Integer.parseInt(command.split(" ")[1]);
                    numbers.add(numberForAdd);
                } else if (command.contains("Insert")) {

                    int numberForInsert = Integer.parseInt(command.split(" ")[1]);
                    int indexOfInsert = Integer.parseInt(command.split(" ")[2]);

                    if (indexOfInsert >= 0 && indexOfInsert <=numbers.size()-1){
                        numbers.add(indexOfInsert,numberForInsert);
                    } else {
                        System.out.println("Invalid index");
                    }

                }else if (command.contains("Remove")){
                    int indexOfRemove = Integer.parseInt(command.split(" ")[1]);
                    if (indexOfRemove>=0 && indexOfRemove<=numbers.size()-1){
                        numbers.remove(indexOfRemove);
                    }else {
                        System.out.println("Invalid index");
                    }
            } else if (command.contains("Shift left")) {
                    int count = Integer.parseInt(command.split(" ")[2]);
                    for (int i = 0; i < count; i++) {
                        int firstNumber = numbers.get(0);
                        numbers.remove(0);
                        numbers.add(firstNumber);
                    }
            }else if (command.contains("Shift right")){
                    int count = Integer.parseInt(command.split(" ")[2]);
                    for (int i = 0; i < count; i++) {
                        int lastNumber = numbers.get(numbers.size()-1);
                        numbers.remove(numbers.size()-1);
                        numbers.add(0,lastNumber);
                    }
                }

            command = scanner.nextLine();
        }
        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}
