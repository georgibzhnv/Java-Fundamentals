import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringToChange = scanner.nextLine();
        StringBuilder changedString = new StringBuilder(stringToChange);
        String input = scanner.nextLine();
        while (!input.equals("Done")){
            String[] commandArgs = input.split(" ");
            String command = commandArgs[0];
            switch (command){
                case "Change":
                    String charToChange = commandArgs[1];
                    String replacement = commandArgs[2];
                    changedString = new StringBuilder(changedString.toString().replaceAll(charToChange,replacement));
                    System.out.println(changedString);
                    break;
                case  "Includes":
                    String substring = commandArgs[1];
                    if (changedString.toString().contains(substring)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String substringEnd = commandArgs[1];
                    boolean isAtTheEnd = changedString.toString().endsWith(substringEnd);
                    if (isAtTheEnd){
                        System.out.println("True");
                }else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                   changedString = new StringBuilder(changedString.toString().toUpperCase());
                    System.out.println(changedString);
                    break;
                case "FindIndex":
                    String charToFindIndex = commandArgs[1];
                    int index = changedString.indexOf(charToFindIndex);
                    System.out.println(index);
                    break;
                case "Cut":
                    int startIdx = Integer.parseInt(commandArgs[1]);
                    int count = Integer.parseInt(commandArgs[2]);
                    String cutString = changedString.substring(startIdx,startIdx+count);
                    System.out.println(cutString);
                    break;
            }


            input=scanner.nextLine();
        }
    }
}
