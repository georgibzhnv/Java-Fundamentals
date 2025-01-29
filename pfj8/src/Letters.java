import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] codes = input.split("\\s+");

        double sum = 0;
        for (String code:codes) {

            double modifiedNumber= getModifiedNumber(code);
            sum+=modifiedNumber;

        }
        System.out.printf("%.2f",sum);
    }

    private static double getModifiedNumber(String code) {
        //code: "{буква}{число}{буква}" => "H456z"
        char letterBefore = code.charAt(0); //'H' -> буква преди числото
        char letterAfter = code.charAt(code.length() - 1); //'z'
        double number = Double.parseDouble(code.replace(letterBefore, ' ') // " 456z"
                .replace(letterAfter, ' ') // " 456 "
                .trim()); //"456" -> parseDouble -> 456

        //модификация спрямо буквата преди числото -> letterBefore
        if (Character.isUpperCase(letterBefore)) {
            //главна буква -> A(65) до Z(90)
            int positionUpperLetter = (int) letterBefore - 64; //позицията на буквата в азбуката
            number /= positionUpperLetter;
            //number = number / positionUpperLetter;
        } else {
            //малка буква -> a(97) до z (122)
            int positionLowerLetter = (int) letterBefore - 96; //позицията на буквата в азбуката
            number *= positionLowerLetter;
            //number = number * positionLowerLetter;
        }

        //модификация на число спрямо буквата след него -> letterAfter
        if (Character.isUpperCase(letterAfter)) {
            //главна буква -> A(65) до Z(90)
            int positionUpperLetter = (int) letterAfter - 64; //позицията на буквата в азбуката
            number -= positionUpperLetter;
            //number = number - positionUpperLetter;
        } else {
            //малка буква -> a(97) до z (122)
            int positionLowerLetter = (int) letterAfter - 96; //позицията на буквата в азбуката
            number += positionLowerLetter;
            //number = number + positionLowerLetter;
        }

        return number;
    }
}