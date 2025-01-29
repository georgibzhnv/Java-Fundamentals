import java.util.*;

public class Company {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>>companies = new LinkedHashMap<>();
        String data = scanner.nextLine();
        while (!data.equals("End")){
            String companyName = data.split(" -> ")[0];
            String employeeId = data.split(" -> ")[1];
            if (companies.containsKey(companyName)){
                List<String>currentEmployees = companies.get(companyName);
                if (!currentEmployees.contains(employeeId)) {
                    currentEmployees.add(employeeId);
                }
            }else {
                companies.put(companyName,new ArrayList<>());
                companies.get(companyName).add(employeeId);
            }
            data= scanner.nextLine();
        }
        for (Map.Entry<String,List<String>>entry: companies.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach(id-> System.out.println("-- "+id));
        }
    }
}
