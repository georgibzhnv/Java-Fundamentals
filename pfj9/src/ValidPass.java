import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("_\\.+(?<passwordText>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String textPassword = matcher.group("passwordText");
                StringBuilder sbDigitsCategory = new StringBuilder();
                for (char symbol:textPassword.toCharArray()) {
                    if (Character.isDigit(symbol)){
                        sbDigitsCategory.append(symbol);
                    }
                }
                if (sbDigitsCategory.length()==0){
                    System.out.println("Group: default");
                }else {
                    System.out.println("Group: "+sbDigitsCategory);
                }
            }else {
                System.out.println("Invalid pass!");
            }
        }
    }
}
