package FinalExam;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] tokens = input.split(" ");

            switch (tokens[0]) {
                case "Translate":
                    char ch = tokens[1].charAt(0);
                    char translate = tokens[2].charAt(0);

                    string = string.replace(ch, translate);
                    System.out.println(string);

                    break;
                case "Includes":
                    String includes = tokens[1];
                    if (string.contains(includes)) {
                        System.out.println("True");

                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String stringToStart = tokens[1];
                    if (string.startsWith(stringToStart)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    string = string.toLowerCase();
                    System.out.println(string);
                    break;
                case "FindIndex":
                    char last = tokens[1].charAt(0);
                    int foundIndex = string.lastIndexOf(last);
                    System.out.println(foundIndex);

                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int count = Integer.parseInt(tokens[2]);
                    String end = "";
                    end = string.substring(startIndex,count);
                    string =  string.replaceAll(end,"");
                    System.out.println(string);
                    break;
            }


            input = scanner.nextLine();
        }
    }
}
