import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String, List<String>>courseList = new LinkedHashMap<>();

        while (!command.equals("end")){
            String courseName = command.split(" : ")[0];
            String studentName = command.split(" : ")[1];
            if (!courseList.containsKey(courseName)){
                courseList.put(courseName,new ArrayList<>());
            }
            courseList.get(courseName).add(studentName);

            command= scanner.nextLine();
        }
        for (Map.Entry<String,List<String>>entry: courseList.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue().size());
            entry.getValue().forEach(studentName -> System.out.println("-- "+studentName));
        }
    }
}
