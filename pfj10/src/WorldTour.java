import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] commandParts = input.split(":");
            String command = commandParts[0];
            switch (command) {
                case "Add Stop":
                    int idx = Integer.parseInt(commandParts[1]);
                    String stop = commandParts[2];
                    if (isValidIndex(idx, stops)) {
                        String left = stops.substring(0,idx);
                        String right = stops.substring(idx);

                        stops = left + stop +right;
                    }
                    break;
                case "Remove Stop":
                    int startIdx =Integer.parseInt(commandParts[1]);
                    int endIdx = Integer.parseInt(commandParts[2]);

                    if (isValidIndex(startIdx,stops) && isValidIndex(endIdx,stops)){
                        String left = stops.substring(0,startIdx);
                        String right = stops.substring(endIdx+1);
                        stops = left+right;
                    }
                    break;
                case "Switch":
                    String oldStr = commandParts[1];
                    String newStr = commandParts[2];

                    stops = stops.replace(oldStr,newStr);
                    break;
            }
            System.out.println(stops);
            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n",stops);
    }

    private static boolean isValidIndex(int idx, String str) {
        return idx >= 0 && idx < str.length();
    }
}