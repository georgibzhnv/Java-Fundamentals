import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>chat = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[]commandArgs = command.split(" ");
            String type = commandArgs[0];
            String message = commandArgs[1];
            switch (type){
                case"Chat":
                    chat.add(message);
                    break;
                case "Delete":
                    if (chat.contains(message)){
                        chat.remove(message);
                    }
                    break;
                case "Edit":
                    if (chat.contains(message)) {
                        String edited = commandArgs[2];
                        int indexOfMessage = chat.indexOf(message);
                        chat.set(indexOfMessage,edited);
                    }
                    break;
                case "Pin":
                    if (chat.contains(message)){
                        chat.remove(message);
                        chat.add(message);
                    }
                    break;
                case "Spam":
                    for (int i=1;i<=commandArgs.length-1;i++){
                     String messages = commandArgs[i];
                     chat.add(messages);
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        for (String message:chat){
            System.out.println(message);
        }
    }
}
