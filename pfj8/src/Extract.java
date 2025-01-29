import java.util.Scanner;

public class Extract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]path = scanner.nextLine().split("\\\\");
        String name = path[path.length-1];
        String fileName = name.split("\\.")[0];
        String extension = name.split("\\.")[1];
        System.out.println("File name: "+ fileName);
        System.out.println("File extension: "+ extension);
    }
}
