import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.contains("swap")){
                int index1 =Integer.parseInt(command.split(" ")[1]);
                int index2 =Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = array[index1];
                int secondIndexNumber = array[index2];

                array[index1] = secondIndexNumber;
                array[index2] = firstIndexNumber;

            } else if (command.contains("multiply")) {
                int index1 =Integer.parseInt(command.split(" ")[1]);
                int index2 =Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = array[index1];
                int secondIndexNumber = array[index2];

                int multipliedNumber = firstIndexNumber*secondIndexNumber;
                array[index1] = multipliedNumber;
            } else if (command.equals("decrease")) {
                for (int index = 0; index <= array.length-1 ; index++) {
                    array[index]--;
                }
            }
            command = scanner.nextLine();
        }
//        System.out.println(Arrays
//                            .toString(array)
//                            .replace("[","")
//                            .replace("]",""));
        for (int i = 0; i <=array.length-1; i++) {
            int number = array[i];
            if (i!=array.length-1){
                System.out.print(number+ " ");
            }else {
                System.out.print(number);
            }
        }
    }
}