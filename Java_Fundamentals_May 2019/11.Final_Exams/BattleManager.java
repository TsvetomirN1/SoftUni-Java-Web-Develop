package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BattleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map<String, Integer> peopleHealth = new LinkedHashMap<>();
        Map<String, Integer> peopleEnergy = new LinkedHashMap<>();


        while (!line.equals("Results")) {
            String[] tokens = line.split(":");

            if (tokens[0].equals("Add")) {

                String name = tokens[1];
                int health = Integer.parseInt(tokens[2]);
                int energy = Integer.parseInt(tokens[3]);

                if (!peopleHealth.containsKey(name)) {
                    int oldHealth = peopleHealth.get(name);
                    peopleHealth.put(name, oldHealth + health);

                } else {
                    peopleHealth.put(name, health);
                }
                if (peopleEnergy.containsKey(name)) {
                    int oldEnergy = peopleEnergy.get(name);
                    peopleEnergy.put(name, oldEnergy + energy);
                } else {
                    peopleEnergy.put(name, energy);
                }
            }

            if (tokens[0].equals("Attack")) {

                String attacker = tokens[1];
                String defender = tokens[2];
                int damage = Integer.parseInt(tokens[3]);

                if (peopleHealth.containsKey(attacker) && peopleHealth.containsKey(defender)) {
                    int defenderOldHealth = peopleHealth.get(defender);
                    peopleHealth.put(defender, defenderOldHealth - damage);

                    if (defenderOldHealth - damage <= 0) {
                        System.out.println(defender + " was disqualified!");
                        peopleHealth.remove(defender);
                        peopleEnergy.remove(defender);
                    }
                    int attackerEnergy = peopleEnergy.get(attacker);
                    peopleEnergy.put(attacker, attackerEnergy - 1);


                    if (attackerEnergy - 1 <= 0) {
                        System.out.println(attacker + " was disqualified!");
                        peopleHealth.remove(attacker);
                        peopleEnergy.remove(attacker);
                    }
                }
            }

            if (tokens[0].equals("Delete")) {

                String userToDelete = tokens[1];

                if (userToDelete.equals("All")) {
                    peopleEnergy.clear();
                    peopleHealth.clear();
                }


                if (peopleEnergy.containsKey(userToDelete)) {
                    peopleEnergy.remove(userToDelete);
                }
                if (peopleHealth.containsKey(userToDelete)) {
                    peopleHealth.remove(userToDelete);
                }


            }

            line = scanner.nextLine();
        }

        System.out.println("People count: " + peopleEnergy.size());

        peopleHealth.entrySet().
                stream().
                sorted((f, s) -> {
                    int result = s.getValue().compareTo(f.getValue());
                    if (result == 0) {
                        result = f.getKey().compareTo(s.getKey());
                    }
                    return result;
                }).forEach(entry ->
                System.out.printf("%s - %d - %d%n",
                        entry.getKey(), entry.getValue(), peopleEnergy.get(entry.getKey())));


    }
}
