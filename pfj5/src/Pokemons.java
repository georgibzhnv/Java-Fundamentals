import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pokemons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int sum = 0;

        while (numbers.size()>0){
            int index = Integer.parseInt(scanner.nextLine());
            if (index>=0 && index<=numbers.size()-1){
                int removedNumber = numbers.get(index);
                sum+=removedNumber;
                numbers.remove(index);
                modifyList(numbers,removedNumber);
            }else if (index<0){
                int removedNumber = numbers.get(0);
                sum+=removedNumber;
                numbers.remove(0);
                int lastNumber = numbers.get(numbers.size()-1);
                numbers.add(0,lastNumber);
                modifyList(numbers,removedNumber);
            } else if (index>numbers.size()-1) {
                int removedNumber = numbers.get(numbers.size()-1);
                sum+=removedNumber;
                numbers.remove(numbers.size()-1);
                int firstNumber = numbers.get(0);
                numbers.add(firstNumber);
                modifyList(numbers,removedNumber);
            }
        }
        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numbers, int removedNumber) {
        for (int i = 0; i <= numbers.size()-1; i++) {
            int currentNumber = numbers.get(i);
            if (currentNumber<=removedNumber){
                currentNumber+=removedNumber;
            }else {
                currentNumber-=removedNumber;
            }
            numbers.set(i,currentNumber);
        }
    }
}
