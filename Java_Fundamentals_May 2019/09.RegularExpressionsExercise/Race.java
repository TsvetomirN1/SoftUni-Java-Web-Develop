package RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> leaderboard = new LinkedHashMap<>();

        String[] participants = scanner.nextLine().split(", ");
        String nameRegex = "[A-Za-z]";
        String distanceRegex = "\\d";
        Pattern namePat = Pattern.compile(nameRegex);
        Pattern distancePat = Pattern.compile(distanceRegex);
        String input = scanner.nextLine();

        for (int i = 0; i < participants.length; i++) {
            leaderboard.putIfAbsent(participants[i], 0);
        }

        while (!input.equals("end of race")) {
            int totalDistance = 0;
            String letter = "";
            Matcher nameMatch = namePat.matcher(input);
            Matcher distanceMatch = distancePat.matcher(input);
            while (distanceMatch.find()) {
                int num = Integer.parseInt(distanceMatch.group());
                totalDistance += num;
            }
            while (nameMatch.find()) {
                letter += nameMatch.group();
            }
            if (leaderboard.containsKey(letter)) {
                leaderboard.put(letter, leaderboard.get(letter) + totalDistance);
            }

            input = scanner.nextLine();
        }

        List<String> topThree = new LinkedList<>();

        leaderboard.entrySet().stream().sorted(Collections.reverseOrder
                (Map.Entry.comparingByValue()))
                .limit(3).forEach(p -> topThree.add(p.getKey()));
        System.out.printf("1st place: %s%n2nd place: %s%n3rd place: %s"
                , topThree.get(0), topThree.get(1), topThree.get(2));
    }
}
