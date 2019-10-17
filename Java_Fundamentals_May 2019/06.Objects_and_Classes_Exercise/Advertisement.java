package ObjectExercise;

import java.util.Random;
import java.util.Scanner;

public class Advertisement {
    static class RandomMessage {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String[] phrases = new String[]{"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};
        String[] events = new String[]{"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] city = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random phrasesRnd = new Random();
        Random eventsRND = new Random();
        Random authorsRND = new Random();
        Random cityRND = new Random();

        for (int i = 0; i < number; i++) {
            int firstIndex = phrasesRnd.nextInt(phrases.length);
            int secondIndex = phrasesRnd.nextInt(events.length);
            int thirdIndex = phrasesRnd.nextInt(authors.length);
            int fourthIndex = phrasesRnd.nextInt(city.length);
            System.out.printf("%s %s %s - %s%n", phrases[firstIndex], events[secondIndex], authors[thirdIndex], city[fourthIndex]);
        }

    }
}
