package Exam06042019;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMovies = Integer.parseInt(scanner.nextLine());

        double maxRating = 0;
        String maxMovie = "";

        double minRating = 11;
        String minMovie = "";

        double sum = 0;

        for (int i = 0; i < countMovies ; i++) {
            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());

            if(rating > maxRating){
                maxRating = rating;
                maxMovie = movieName;
            }

            if(rating < minRating){
                minRating = rating;
                minMovie = movieName;
            }

            sum += rating;

        }

        double average = sum / countMovies;

        System.out.printf("%s is with highest rating: %.1f%n", maxMovie, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", minMovie, minRating);
        System.out.printf("Average rating: %.1f",average );

    }
}



