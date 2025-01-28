import java.util.*;
import java.util.stream.Collectors;

public class AppendArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String>list = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(list);

        System.out.println(list.toString()
                .replace("[","")
                .replace("]","")
                .trim()
                .replaceAll(",","")
                .replaceAll("\\s+"," "));

    }
}
