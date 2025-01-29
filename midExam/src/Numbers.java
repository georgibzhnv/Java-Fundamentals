import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Finish")){
            String[] commandArgs = command.split(" ");
            String type = commandArgs[0];
            int value = Integer.parseInt(commandArgs[1]);

            switch (type){
                case "Add":
                    numbers.add(Integer.valueOf(value));
                    break;
                case "Remove":
                    if (numbers.contains(value)){
                        numbers.remove(Integer.valueOf(value));
                    }
                    break;
                case "Replace":
                    int replacement = Integer.parseInt(commandArgs[2]);
                    if (numbers.contains(value)){
                        numbers.set(numbers.indexOf(value),replacement);
                    }
                    break;
                case "Collapse":
                    for (int i = numbers.size() - 1; i >= 0; i--) {
                        int currentNumber = numbers.get(i);
                        if (currentNumber < value) {
                            numbers.remove(i);
                        }
                    }
                    break;
            }

            command= scanner.nextLine();
        }
        for (int number:
             numbers) {
            System.out.print(number+" ");
        }
    }
}