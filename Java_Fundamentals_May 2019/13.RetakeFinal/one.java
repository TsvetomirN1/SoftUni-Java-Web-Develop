package RetakeFinal;

import java.util.Collections;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Sign up")) {

            String[] tokens = input.split(" ");

            if (tokens[0].equals("Case")) {
                if (tokens[1].equals("lower")) {
                    text = text.toLowerCase();
                } else {
                    text = text.toUpperCase();
                }
                System.out.println(text);

            }
            if (tokens[0].equals("Reverse")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);

                if (startIndex + endIndex < text.length()&& startIndex>=0 && endIndex<text.length()) {
                    String substring = text.substring(startIndex, endIndex + 1);
                    StringBuilder sb = new StringBuilder();
                    sb.append(substring);
                    sb.reverse();
                    System.out.println(sb.toString());
                }else {
                    break;
                }

            }

            if (tokens[0].equals("Cut")) {
                String substring = tokens[1];

                if (text.contains(substring) && substring.length()<text.length()) {
                    text = text.replace(substring, "");
                    System.out.println(text);
                } else {
                    System.out.printf("The word %s doesn't contain %s.%n", text, substring);
                }
            }
            if (tokens[0].equals("Replace")) {
                char charToReplace = tokens[1].charAt(0);
                for (int i = 0; i < text.length(); i++) {
                    char ch = text.charAt(i);
                    if (ch == charToReplace) {
                        text = text.replace(ch, '*');
                        System.out.println(text);
                    }
                }

            }
            if (tokens[0].equals("Check")) {
                char ch = tokens[1].charAt(0);
                boolean isTrue = false;

                for (int i = 0; i < text.length(); i++) {
                    char current = text.charAt(i);
                    isTrue = current == ch && current < text.length();
                }
                if (isTrue) {
                    System.out.println("Valid");
                } else {
                    System.out.printf("Your username must contain %c.%n", ch);
                }
            }

            input = scanner.nextLine();
        }
    }
}

