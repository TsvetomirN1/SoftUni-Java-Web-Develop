package MIDEXAMS.MidExam18Dec2018;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> kids = Arrays.stream(scanner.nextLine().split("&+")).collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" +");
        while (!command[0].equals("Finished!")) {
            if (command[0].equals("Bad")) {
                if (!kids.contains(command[1])) {
                    kids.add(0, command[1]);
                }
            } else if (command[0].equals("Good")) {
                kids.remove(command[1]);
            } else if (command[0].equals("Rename")) {
                if (kids.contains(command[1])) {
                    kids.set(kids.indexOf(command[1]), command[2]);
                }
            } else if (command[0].equals("Rearrange")) {
                if (kids.contains(command[1])) {
                    kids.remove(command[1]);
                    kids.add(command[1]);
                }
            }
            command = scanner.nextLine().split(" +");
        }
        for (String kid : kids) {
            if (kids.indexOf(kid) == kids.size() - 1) {
                System.out.print(kid);
            } else {
                System.out.print(kid + ", ");
            }
        }
    }
}
