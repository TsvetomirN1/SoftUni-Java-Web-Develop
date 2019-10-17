package ExamsPractice2;

import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String matchOne = scanner.nextLine();
        String matchTwo = scanner.nextLine();
        String matchThree = scanner.nextLine();

        int firstResult1 = matchOne.charAt(0);
        int secondResult1 = matchOne.charAt(2);

        int win = 0;
        int drawn = 0;
        int losses = 0;

        if (firstResult1 > secondResult1) {
            win++;
        } else if (firstResult1 == secondResult1) {
            drawn++;
        } else {
            losses++;
        }
        int firstResult2 = matchTwo.charAt(0);
        int secondResult2 = matchTwo.charAt(2);

        if (firstResult2 > secondResult2) {
            win++;
        } else if (firstResult2 == secondResult2) {
            drawn++;
        } else {
            losses++;
        }

        int firstResult3 = matchThree.charAt(0);
        int secondResult3 = matchThree.charAt(2);

        if (firstResult3 > secondResult3) {
            win++;
        } else if (firstResult3 == secondResult3) {
            drawn++;
        } else {
            losses++;
        }
        System.out.printf("Team won %d games.%n", win);
        System.out.printf("Team lost %d games.%n", losses);
        System.out.println("Drawn games: " + drawn);


    }
}
