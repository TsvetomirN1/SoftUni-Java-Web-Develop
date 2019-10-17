package RegularExpressionsExercise;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([a-z0-9_.-]+)@([a-z0-9_.-]+[a-z])";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        ArrayList<String> emails = new ArrayList<>();

        while (matcher.find()) {
            emails.add(matcher.group());
        }

        for (String email : emails) {
            System.out.println(email);
        }
    }
}
