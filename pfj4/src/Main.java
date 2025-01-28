//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        int number  = Math.abs(Integer.parseInt(input));
//        int evenSum = getSumOfEvenDigits(numberAsString);
//        int oddSum = getSumOfOddDigits(numberAsString);
//        getMultipleOfEvenAndOdds(evenSum,oddSum);
//    }
//
//    public static int getSumOfEvenDigits(String[] number){
//        int sum =0;
//        for (int i = 0; i <=number.length-1 ; i++) {
//            int currentNumber =Integer.parseInt(number[i]);
//            if (currentNumber%2==0){
//                sum+=currentNumber;
//            }
//        }
//        return sum;
//    }
//    public static int getSumOfOddDigits(String[] number){
//        int sum =0;
//        for (int i = 0; i <=number.length-1 ; i++) {
//            int currentNumber = Integer.parseInt(number[i]);
//            if (currentNumber%2!=0){
//                sum+=currentNumber;
//            }
//        }
//        return sum;
//    }
//    public static void getMultipleOfEvenAndOdds(int oddSum, int evenSum){
//        System.out.println(oddSum*evenSum);
//        }
//}
//

