package MIDEXAMS.MidExam4nov2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestsJournal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = scanner.nextLine().split(", ");
        List<String> words = new ArrayList<>();

        for (int i = 0; i <wordsArray.length ; i++) {
            words.add(wordsArray[i]);
        }

        String line = scanner.next();

        while (!line.equals("Retire!")) {
            String [] input =scanner.nextLine().split(" - ");
            switch (line) {
                case "Start": {
                    String quest  = input[1];
                    if (!words.contains(quest)) {
                        words.add(quest);
                        break;
                    }
                }
                case "Complete": {
                    String quest = input[1];
                    if (words.contains(quest)) {
                        words.remove(quest);
                        break;
                    }
                }
                case "Side Quest": {
                    String[] com = scanner.nextLine().split(":");
                    String quest = com[0];
                    String sideQuest = com[1];
                    if (words.contains(quest)) {
                       words.add(sideQuest);
                    }
                    if (words.contains(sideQuest)) {
                        break;
                    }
                }
                case "Renew": {
                    String quest = scanner.next();
                    if (words.contains(quest)) {
                        words.remove(quest);
                        words.set(words.size()-1,quest);

                    }
                    break;
                }
            }

            line = scanner.next();
        }

        System.out.println(String.join(", ", words));
    }

}




