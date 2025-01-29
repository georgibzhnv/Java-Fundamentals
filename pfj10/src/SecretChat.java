import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        StringBuilder messageBuilder = new StringBuilder(message);
        String input = scanner.nextLine();
        while (!input.equals("Reveal")){
            String [] commandArgs = input.split(":\\|:");
            String command = commandArgs[0];
            switch (command){
                case"InsertSpace":
                    int idx =Integer.parseInt(commandArgs[1]);
                    messageBuilder.insert(idx," ");
                    System.out.println(messageBuilder);
                    break;
                case "Reverse":
                    String substring = commandArgs[1];
                    if (messageBuilder.toString().contains(substring)){
                        int idxOfSubstring = messageBuilder.indexOf(substring);
                        messageBuilder.delete(idxOfSubstring,messageBuilder.length());
                        String reversedSubstring = new StringBuilder(substring).reverse().toString();
                        messageBuilder.append(reversedSubstring);
                        System.out.println(messageBuilder);
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String oldString = commandArgs[1];
                    String newString  = commandArgs[2];
                    messageBuilder = new StringBuilder(messageBuilder.toString().replaceAll(oldString,newString));
                    System.out.println(messageBuilder);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s%n",messageBuilder);
    }
}
