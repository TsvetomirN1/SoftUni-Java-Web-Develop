package MIDEXAMS.MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContactList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> contacts = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i <contacts.size() ; i++) {

           switch (input[0]) {
                case "Add":
                    String contact = input[1];
                    int index = Integer.parseInt(input[2]);

                    if (contacts.contains(contact)) {
                        contacts.set(index, contact);
                    } else {

                        contacts.set(contacts.size() - 1, contact);
                    }
                    break;

                case "Remove":
                    int indexToRemove = Integer.parseInt(input[1]);

                    for (int k = 0; k < contacts.size(); k++) {
                        if (k == indexToRemove) {
                            contacts.remove(k);
                        }
                    }
                    break;

                case "Export":
                    int startIndex = Integer.parseInt(input[1]);
                    int count = Integer.parseInt(input[2]);

                    for (int p = startIndex; p <= count; p++) {
                        System.out.println(p + " ");
                        if (count > contacts.size()) {
                            for (int j = startIndex + 1; j < contacts.size(); j++) {
                                System.out.println(j + " ");
                            }
                        }


                    }

                    break;

                case "Print":
                    String normalOrReversed = input[1];
                    if (input[1].equals("Normal")) {
                        for (String s : contacts) {
                            System.out.println(s + " ");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (int d = 0; d < contacts.size(); d++) {
                            sb.append(d);
                            sb.reverse();
                            System.out.println(sb);
                        }

                    }


                    break;

            }
        }
    }
}
