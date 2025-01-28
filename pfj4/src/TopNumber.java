import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=number ; i++) {
            boolean isValidSumDigits = checkSumDigitsIsDivisibleBy8(i);
            boolean isContainingOddDigit = checkIfNumberHasOddDigit(i);
            if(isContainingOddDigit&&isValidSumDigits){
                System.out.println(i);
            }
        }
    }

    public static boolean checkSumDigitsIsDivisibleBy8(int number){
        int sum = 0;
        while (number>0){
            int lastDigit = number%10;
            sum+=lastDigit;
            number /=10;
        }
        if (sum%8==0){
            return true;
        }else {
        return false;
        }
    }
    public static boolean checkIfNumberHasOddDigit(int number){
        while (number>0){
            int lastDigit = number%10;
            if (lastDigit%2!=0){
                return true;
            }else {
                number /= 10;
            }
        }
        return false;
    }
}
