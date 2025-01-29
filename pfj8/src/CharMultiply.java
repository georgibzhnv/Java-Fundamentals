import java.util.Scanner;

public class CharMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] texts = input.split(" ");
        String firstText = texts[0];
        String secondText = texts[1];
       printSum(firstText,secondText);

    }
    public static void printSum(String first,String second){

        int maxLength = Math.max(first.length(),second.length());
        int minLength = Math.min(first.length(),second.length());

        int sum = 0;

        for (int i = 0; i <= minLength-1; i++) {
            sum+=(first.charAt(i)*second.charAt(i));
        }

        if (first.length()==second.length()){
            System.out.println(sum);
        } else if (maxLength==first.length()) {
            for (int i = minLength; i <=first.length()-1 ; i++) {
                sum+=first.charAt(i);
            }
            System.out.println(sum);
        }else {
            for (int i = minLength; i <=second.length()-1 ; i++) {
                sum+=second.charAt(i);
            }
            System.out.println(sum);
        }
    }
}
