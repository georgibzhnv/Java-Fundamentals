import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    private static boolean isInside(List<Integer>list, int idx){
        return idx>=0 && idx<list.size();
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] commandArgs = command.split(" ");
            String type = commandArgs[0];
            int index = Integer.parseInt(commandArgs[1]);
            switch (type){
                case "Shoot":
                    int power = Integer.parseInt(commandArgs[2]);
                    if (isInside(targets,index)){;
                        targets.set(index,(targets.get(index)-power));
                        if (targets.get(index)<=0) {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    int value  = Integer.parseInt(commandArgs[2]);
                    if (isInside(targets, index)) {
                        targets.add(index,value);
                    }else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(commandArgs[2]);
                    int leftIndex= index-radius;
                    int rightIndex = index+radius;
                    if (isInside(targets,leftIndex)&&isInside(targets,rightIndex)){
                        int count  = radius*2+1;
                        for (int i = 0; i <count ; i++) {
                            targets.remove(leftIndex);
                        }
                    }else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(String.join("|",targets.stream()
                .map(String::valueOf).collect(Collectors.toList())));
    }
}
