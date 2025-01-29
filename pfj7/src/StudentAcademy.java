import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String,List<Double>>studentList = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double grade =Double.parseDouble(scanner.nextLine());
            if (studentList.containsKey(name)){
                List<Double>currentGrades = studentList.get(name);
                currentGrades.add(grade);
            }else {
                studentList.put(name,new ArrayList<>());
                studentList.get(name).add(grade);
            }
        }
        
        LinkedHashMap<String, Double>averageGrades = new LinkedHashMap<>();
        for (Map.Entry<String,List<Double>>entry: studentList.entrySet()) {
            String studentName = entry.getKey();
            List<Double>grades = entry.getValue();
            double average = getAverageGrade(grades);

            if (average>=4.50){
                averageGrades.put(studentName,average);
            }
        }
        for (Map.Entry<String,Double>entry: averageGrades.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue());
        }
    }

    private static double getAverageGrade(List<Double> grades) {
        double sum = 0;
        for (double grade:grades) {
            sum+=grade;
        }
        return sum/grades.size();
    }
}
