import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regexUsername = "[A-Za-z0-9]+[\\.\\-\\_]?[A-Za-z0-9]+";
        String regexHost = "[A-Za-z]+\\-?[A-Za-z]+(\\.[A-Za-z]+\\-?[A-Za-z]+)+";
        String fullRegex = regexUsername+"@"+regexHost;
        Pattern pattern = Pattern.compile(fullRegex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
