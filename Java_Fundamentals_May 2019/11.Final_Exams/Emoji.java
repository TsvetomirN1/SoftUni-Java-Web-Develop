package FinalExamTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emoji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int[] values = Arrays.stream(scanner.nextLine().split(":"))
                .mapToInt(Integer::parseInt).toArray();

        List<String> emojies = new ArrayList<>();

        String emoji = "";
        for (int num : values) {
            emoji += (char) num;

        }
        Matcher matcher = Pattern.compile("\\s:([a-z]{4,}):(?=[ ,.!?])").matcher(text);

        int totalPower = 0;

        while (matcher.find()) {
            String found = matcher.group(1);
            emojies.add(found);
            int power = 0;

            for (char c : found.toCharArray()) {
                power += c;
            }
            totalPower += power;
        }

        if (emojies.contains(emoji)) {
            totalPower *= 2;
        }
        if (!emojies.isEmpty()) {
            System.out.print("Emojis found: ");
            for (int i = 0; i < emojies.size(); i++) {
                if (i != emojies.size() - 1) {
                    System.out.print(":" + emojies.get(i) + ":, ");
                } else {
                    System.out.println(":" + emojies.get(i) + ":");
                }
            }
        }

        System.out.println("Total Emoji Power: " + totalPower);
    }
}
