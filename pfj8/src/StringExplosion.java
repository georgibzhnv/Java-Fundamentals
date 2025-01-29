import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder builder = new StringBuilder(input);
        int totalStrength =0;

        for (int i = 0; i < builder.length(); i++) {
            char currentSymbol = builder.charAt(i);
            if (currentSymbol=='>'){
              int explosionStrength =Integer.parseInt(builder.charAt(i+1)+"");
              totalStrength+=explosionStrength;
            } else if (currentSymbol!='>'&&totalStrength>0) {
                builder.deleteCharAt(i);
                totalStrength--;
                i--;
            }
        }
        System.out.println(builder);
    }
}
