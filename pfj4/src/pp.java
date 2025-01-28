import java.util.Scanner;
public class pp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            // Use Math.abs to get the absolute value of the input string as an integer
            int number = Math.abs(Integer.parseInt(input));
            String numberAsString = Integer.toString(number);
            int evenSum = getSumOfEvenDigits(numberAsString);
            int oddSum = getSumOfOddDigits(numberAsString);
            getMultipleOfEvenAndOdds(oddSum, evenSum);
        }

        public static int getSumOfEvenDigits(String number) {
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                int currentDigit = Character.getNumericValue(number.charAt(i));
                if (currentDigit % 2 == 0) {
                    sum += currentDigit;
                }
            }
            return sum;
        }

        public static int getSumOfOddDigits(String number) {
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                int currentDigit = Character.getNumericValue(number.charAt(i));
                if (currentDigit % 2 != 0) {
                    sum += currentDigit;
                }
            }
            return sum;
        }

        public static void getMultipleOfEvenAndOdds(int oddSum, int evenSum) {
            System.out.println(oddSum * evenSum);
        }
    }

