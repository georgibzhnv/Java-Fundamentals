import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        boolean a =countOfCharacters(pass);
        boolean b = typeOfCharacters(pass);
        boolean c =countOfDigits(pass);
        if (isValid(a,b,c)) {
            System.out.println("Password is valid");
        }
    }
    public static boolean isValid(boolean a, boolean b, boolean c){
        boolean valid = true;
        if (a!=true|| b!=true || c!=true){
            valid = false;
        }
        return valid;
    }
    public static boolean countOfCharacters(String pass){
        if (pass.length()<6 || pass.length()>10){
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }
    public static boolean typeOfCharacters(String pass){
         if (!pass.matches("[a-zA-Z0-9]+")){
             System.out.println("Password must consist only of letters and digits");
             return false;
         }
         return true;
        }
    public static boolean countOfDigits(String pass){
        int digitCount = 0;
        for (char c :pass.toCharArray()){
            if (Character.isDigit(c)){
                digitCount++;
            }
        }
        if (digitCount<2){
            System.out.println("Password must have at least 2 digits");
            return false;
        }
        return true;
    }
}

