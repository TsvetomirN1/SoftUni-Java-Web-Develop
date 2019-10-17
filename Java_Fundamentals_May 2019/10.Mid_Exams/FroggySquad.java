package MIDEXAMS.Exams_Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FroggySquad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> frogs = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Print Normal") && !command.equals("Print Reversed")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Join": {
                    String name = tokens[1];
                    if (!frogs.contains(name)) {
                        frogs.add(name);
                    }
                    break;
                }
                case "Jump": {
                    String name = tokens[1];
                    int index = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index < frogs.size()) {
                        frogs.add(index, name);
                    }
                    break;
                }
                case "Dive": {
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < frogs.size()) {
                        frogs.remove(index);
                    }
                    break;
                }
                case "First": {
                    int count = Integer.parseInt(tokens[1]);

                    if (count > frogs.size()) {
                        for (int i = 0; i < frogs.size(); i++) {

                            System.out.printf("%s ", frogs.get(i));
                        }
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.printf("%s ",frogs.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
                case "Last": {
                    int count = Integer.parseInt(tokens[1]);
                    if (count > frogs.size()) {
                        for (int i = 0; i < frogs.size(); i++) {
                            System.out.printf("%s ",frogs.get(i));
                        }
                    } else {
                        for (int i = frogs.size() - count; i < frogs.size(); i++) {
                            System.out.printf("%s ", frogs.get(i));
                        }
                    }
                    System.out.println();
                    break;
                }
            }


            command = scanner.nextLine();
        }
        if(command.equals("Print Reversed")){
            Collections.reverse(frogs);
            System.out.printf("Frogs: ");
            for (int i = 0; i <frogs.size() ; i++) {
                System.out.printf("%s ",frogs.get(i));
            }
        }else {
            System.out.printf("Frogs: ");
            for (int i = 0; i < frogs.size(); i++) {
                System.out.printf("%s ", frogs.get(i));
            }
        }
    }
}
