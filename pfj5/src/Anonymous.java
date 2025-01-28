import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Anonymous {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>array = Arrays.stream(scanner.nextLine()
                            .split(" "))
                            .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("3:1")){
            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex<0){
                    startIndex=0;
                }

                if (endIndex>array.size()-1){
                    endIndex=array.size()-1;
                }

                if (startIndex>=0 && startIndex<=array.size()-1 && endIndex>=0 && endIndex<=array.size()-1){
                    String resultMerge = "";
                    for (int i = startIndex; i <=endIndex ; i++) {
                        String current = array.get(i);
                        resultMerge+=current;
                    }
                    for (int i = startIndex; i <=endIndex ; i++) {
                        array.remove(startIndex);
                    }
                    array.add(startIndex,resultMerge);
                }
            } else if (command.contains("divide")) {
                //command = "divide {index} {partitions}"
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]); //брой на частите

                //валидираме индекса, от който ще взимаме текст
                if (index >= 0 && index <= array.size() - 1) {
                    //{"abcdef", "ghi", "jkl"}
                    //divide 0 3
                    String textForDivide = array.get(index); //"abcdef"
                    array.remove(index);
                    //{"ghi", "jkl"}

                    //1. колко символа ще има всяка част
                    int countSymbolsPerPart = textForDivide.length() / parts;

                    //всички равни части без последната
                    int beginIndex = 0; //index в текста за деление
                    for (int part = 1; part < parts; part++) {
                        String textPerPart = textForDivide.substring(beginIndex, beginIndex + countSymbolsPerPart);
                        array.add(index, textPerPart);
                        index++; //място на поставяне на разбитата част в главния списък
                        beginIndex += countSymbolsPerPart;
                    }

                    //последната част
                    String textLastParts = textForDivide.substring(beginIndex, textForDivide.length());
                    array.add(index, textLastParts);
                }

            }


            command = scanner.nextLine();
        }
        for (String text:
             array) {
            System.out.print(text + " ");
        }
    }
}
