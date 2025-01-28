import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());

        int countHeadset = 0;
        int countMouse = 0;
        int countKeyboard = 0;
        int countDisplay = 0;

        for (int i = 1; i <=lostGames ; i++) {
            if (i%2==0){
                countHeadset++;
            }
            if (i%3==0){
                countMouse++;
            }
            if (i%6==0){
                countKeyboard++;
            }
            if (i%12 ==0){
                countDisplay++;
            }
        }
        double totalPrice = (countHeadset*headset) + (countMouse*mouse) + (countKeyboard*keyboard) +(countDisplay*display);
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
