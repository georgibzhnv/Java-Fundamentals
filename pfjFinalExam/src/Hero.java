import java.util.*;

public class Hero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String,List<String>>heroesAndSpells = new LinkedHashMap<>();
        while (!input.equals("End")){
            String[] commandArgs = input.split(" ");
            String command = commandArgs[0];
            String heroName = commandArgs[1];
            switch (command){
                case "Enroll":
                    if (heroesAndSpells.containsKey(heroName)){
                        System.out.printf("%s is already enrolled.%n",heroName);
                    }else {
                        heroesAndSpells.put(heroName,new ArrayList<>());
                    }
                    break;
                case "Learn":
                    String spellName = commandArgs[2];
                    if (!heroesAndSpells.containsKey(heroName)) {
                        System.out.printf("%s doesn't exist.%n", heroName);
                    }else {
                        List<String>spells = heroesAndSpells.get(heroName);
                        if (spells.contains(spellName)){
                            System.out.printf("%s has already learnt %s.%n",heroName,spellName);
                        }else {
                            spells.add(spellName);
                        }
                    }
                    break;
                case "Unlearn":
                    spellName = commandArgs[2];
                    if (!heroesAndSpells.containsKey(heroName)) {
                        System.out.println(heroName + " doesn't exist.");
                    } else {
                        List<String> spells = heroesAndSpells.get(heroName);
                        if (!spells.contains(spellName)) {
                            System.out.println(heroName + " doesn't know " + spellName + ".");
                        }else {
                            spells.remove(spellName);
                        }
                    }
                    break;
            }
            input= scanner.nextLine();
        }
        System.out.println("Heroes:");
        for (Map.Entry<String,List<String >>entry: heroesAndSpells.entrySet()) {
            System.out.println("== " + entry.getKey() +": " +String.join(", ", entry.getValue()));
        }
    }
}
