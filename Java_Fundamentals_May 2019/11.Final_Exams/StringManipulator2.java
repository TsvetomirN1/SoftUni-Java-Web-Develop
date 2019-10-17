package FinalExam;

import java.util.Scanner;

public class StringManipulator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Done")) {

            String[] inputArray = input.split(" ");

            if (inputArray[0].equals("Change")) {
                char oldChar = inputArray[1].charAt(0);
                char newChar = inputArray[2].charAt(0);
                text = text.replace(oldChar, newChar);
                System.out.println(text);

            }
            if (inputArray[0].equals("Includes")) {
                String includesValue = inputArray[1];
                if (text.contains(includesValue)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            }
            if (inputArray[0].equals("End")) {

                String endsWith = inputArray[1];
                String[] last = text.split(" ");
                if (last[last.length - 1].equals(endsWith)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            }
            if (inputArray[0].equals("Uppercase")) {

                text = text.toUpperCase();
                System.out.println(text);
            }
            if (inputArray[0].equals("FindIndex")) {

                char index = inputArray[1].charAt(0);
                int foundIndex = text.indexOf(index);
                System.out.println(foundIndex);

            }
            if (inputArray[0].equals("Cut")) {

                int startIndex = Integer.parseInt(inputArray[1]);
                int length = Integer.parseInt(inputArray[2]);
                String newText = "";

                for (int i = startIndex; i < startIndex + length; i++) {
                    char current = text.charAt(i);
                    newText = newText + current;
                }
                if (!newText.equals("")) {
                    System.out.println(newText);
                }
            }

            input = scanner.nextLine();
        }
    }
}