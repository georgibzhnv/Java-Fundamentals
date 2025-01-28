import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] string = input.split("");
        getMiddleCharacter(string);
    }

    public static void getMiddleCharacter(String[] string) {
            if (string.length%2!=0){
                System.out.println(string[string.length/2]);
            }else {
                System.out.print(string[(string.length/2)-1]);
                System.out.println(string[string.length/2]);
            }

    }
}
