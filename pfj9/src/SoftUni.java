
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("%(?<studentName>[A-Z][a-z]+)%[^\\|$%\\.]*<(?<product>\\w+)>[^\\|$%\\.]*\\|(?<quantity>[0-9]+)[^\\|$%\\.]*\\|(?<price>[0-9]+\\.?[0-9]*)\\$");
        double totalIncome = 0;

        while (!input.equals("end of shift")){
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()){
            String studentName = matcher.group("studentName");
            String product = matcher.group("product");
            double price = Double.parseDouble(matcher.group("price"));
            int quantity = Integer.parseInt(matcher.group("quantity"));

            double pricePerProduct = quantity*price;
            totalIncome+=pricePerProduct;
            System.out.printf("%s: %s - %.2f%n",studentName,product,pricePerProduct);
        }
            input= scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalIncome);
    }
}
