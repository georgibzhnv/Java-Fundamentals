import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        getSmallestInt(a,b,c);
    }

    public static void getSmallestInt(int a, int b, int c){
        if (a<b && a<c){
            System.out.println(a);
        } else if (b<a && b<c) {
            System.out.println(b);
        } else{
            System.out.println(c);
        }
    }
}
