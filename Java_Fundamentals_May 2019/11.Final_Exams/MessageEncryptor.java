package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageEncryptor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfInputs; i++) {

            String input = scanner.nextLine();

            Pattern patter = Pattern.compile("([*|@])(?<tag>[A-Z][a-z]{3,})\\1: (\\[(?<msg>[a-z|A-Z])\\]\\|){3}$");
            Matcher matcher = patter.matcher(input);

            if (matcher.find()) {
                String tag = matcher.group(2);
                int one = matcher.group(4).charAt(1);
                int two = matcher.group(5).charAt(1);
                int three = matcher.group(6).charAt(1);

                if (tag.length() >= 3) {

                    System.out.print(tag + ":" + " " + one + " " + two + " " + three);
                    System.out.println();
                } else {
                    System.out.println("Valid message not found!");
                }

            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
