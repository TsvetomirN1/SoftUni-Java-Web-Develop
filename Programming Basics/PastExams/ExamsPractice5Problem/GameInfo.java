package ExamsPractice5;

import java.util.Scanner;

public class GameInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        int gamesPlayed = Integer.parseInt(scanner.nextLine());
        double totalMinutes = 0;
        double additionalTime = 0;
        double penalties = 0;


        for (int i = 1; i <=gamesPlayed; i++) {
            int minutesPerGame = Integer.parseInt(scanner.nextLine());

            if (minutesPerGame>90 && minutesPerGame<=120){
                additionalTime++;
                totalMinutes+=minutesPerGame;
            }else if (minutesPerGame>120){
                penalties++;
                totalMinutes+=minutesPerGame;
            }else {
                totalMinutes+=minutesPerGame;
            }

        }
        double averageTime = totalMinutes/gamesPlayed;

        System.out.printf("%s has played %.0f minutes. Average minutes per game: %.02f%n",team,totalMinutes,averageTime);
        System.out.printf("Games with penalties: %.0f%n",penalties);
        System.out.printf("Games with additional time: %.0f",additionalTime);

    }
}
