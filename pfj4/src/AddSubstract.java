import java.util.Scanner;

public class AddSubstract{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int ab = sumIntegers(a,b);
        System.out.println(substractInteger(ab,c));

    }
    public static int sumIntegers (int a, int b){
        return a+b;
    }
    public static int substractInteger (int ab,int c){
        return ab-c;
    }
}
