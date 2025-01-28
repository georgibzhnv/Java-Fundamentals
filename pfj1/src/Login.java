import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        String username = scanner.nextLine();
        String login = scanner.nextLine();
        String password = "";
        for (int i = username.length()-1; i>=0; i--) {
            char ch = username.charAt(i);
            password +=ch;
        }

        while (!login.equals(password)){
            tries++;
            if (tries==4){
                System.out.printf("User %s blocked!",username);
                return;
            }
            System.out.printf("Incorrect password. Try again.%n");
            login = scanner.nextLine();
        }
        System.out.printf("User %s logged in.",username );
    }
}
