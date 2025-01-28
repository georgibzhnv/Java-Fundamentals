import java.util.Arrays;
import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int [] array = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        boolean liftFull = true;

        for (int i = 0; i < array.length; i++) {
            int availableSpace = 4 - array[i];

            if (availableSpace>0){
                if (availableSpace>people){
                array[i]+=people;
                people = 0;
                liftFull = false;
            }else {
                array[i]=4;
                people-=availableSpace;
            }
            }
        }
        if (!liftFull){
            System.out.println("The lift has empty spots!");
        } else if (people>0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n",people);
        }
        for (int wagon:array
             ) {
            System.out.print(wagon + " ");
        }
    }
}
