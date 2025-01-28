import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        char valueOfA = a.charAt(0);
        char valueOfB = b.charAt(0);
        getCharactersInRange(valueOfA, valueOfB);
    }

    public static void getCharactersInRange(char a, char b) {
        if (b > a) {
            for (int i = a + 1; i < b; i++) {
                char value = (char) i;
                System.out.print(value + " ");
            }
        } else {
            for (int i = b + 1; i < a; i++) {
                char value = (char) i;
                System.out.print(value + " ");
            }
        }
    }
}