import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bomb{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .collect(Collectors.toList());
        String []data =scanner.nextLine().split(" ");
        String bombNumber = data[0];
        int power = Integer.parseInt(data[1]);

        while (numbers.contains(bombNumber)){
            int numbersIndex = numbers.indexOf(bombNumber);
            int left = Math.max(0,numbersIndex-power);
            int right = Math.min(numbersIndex+power,numbers.size()-1);

            for (int i = right; i >=left ; i--) {
                numbers.remove(i);
            }
        }

        System.out.println(numbers.stream().mapToInt(Integer::parseInt).sum());
    }
}
