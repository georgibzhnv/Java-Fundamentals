import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap <String,String>composerByPiece = new LinkedHashMap<>();
        LinkedHashMap <String,String>keyByPiece = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String piece = input[0];
            String composer = input[1];
            String key = input[2];

            composerByPiece.put(piece,composer);
            keyByPiece.put(piece,key);
        }
        while (true){
            String line = scanner.nextLine();
            if (line.equals("Stop")){
                break;
            }

            String[]commandParts = line.split("\\|");
            String command = commandParts[0];
            switch (command){
                case "Add":
                    String piece = commandParts[1];
                    String composer = commandParts[2];
                    String key = commandParts [3];
                    if (composerByPiece.containsKey(piece)){
                        System.out.printf("%s is already in the collection!%n",piece);
                    }else {
                        composerByPiece.put(piece,composer);
                        keyByPiece.put(piece,key);
                        System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);
                    }
                    break;
                case"Remove":
                    String pieceToRemove = commandParts[1];
                    if (!composerByPiece.containsKey(pieceToRemove)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceToRemove);
                    }else {
                        composerByPiece.remove(pieceToRemove);
                        System.out.printf("Successfully removed %s!%n",pieceToRemove);
                    }
                    break;
                case "ChangeKey":
                    String pieceToChangeKey = commandParts[1];
                    String newKey = commandParts[2];
                    if (!keyByPiece.containsKey(pieceToChangeKey)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceToChangeKey);
                    }else {
                        keyByPiece.put(pieceToChangeKey,newKey);
                        System.out.printf("Changed the key of %s to %s!%n",pieceToChangeKey,newKey);
                    }
                    break;
            }
        }
        for (Map.Entry<String,String>entry: composerByPiece.entrySet()) {
                    String piece = entry.getKey();
                    String composer =entry.getValue();
                    String key= keyByPiece.get(piece);

                    System.out.printf("%s -> Composer: %s, Key: %s%n",piece,composer,key);
                }
    }
}
