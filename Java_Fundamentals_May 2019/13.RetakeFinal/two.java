package RetakeFinal;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {

            String input = scanner.nextLine();

            Pattern pattern = Pattern.compile("^(.+)>(\\d+)\\|([a-z]+){0,3}\\|([A-Z]+){0,3}\\|([^<>]+){0,3}<\\1$");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                String group1 = (matcher.group(2));
                String group2 = (matcher.group(3));
                String group3 = (matcher.group(4));
                String group4 = (matcher.group(5));


                StringBuilder message = new StringBuilder();
                message.append(group1);
                message.append(group2);
                message.append(group3);
                message.append(group4);
                if (group1.length() == 3 && group2.length() == 3 && group3.length() == 3 && group4.length() == 3) {

                    System.out.printf("Password: %s%n", message);

                } else if (group1.length() <= 0 && group2.length() <= 0 && group3.length() <= 0 && group4.length() <= 0) {
                    System.out.println("Try another password!");
                }
            } else {
                System.out.println("Try another password!");
            }

        }
    }

}

