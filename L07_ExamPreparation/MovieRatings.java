package L07_ExamPreparation;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMovies = Integer.parseInt(scanner.nextLine());
        String highMovie = "";
        String lowMovie = "";
        double ratingHigh = 0;
        double ratingLow = 11;
        double ratings = 0.0;

        for (int i = 1; i <= countMovies; i++) {

            String inputMovie = scanner.nextLine();
            double inputRating = Double.parseDouble(scanner.nextLine());

            ratings += inputRating;
            if (inputRating > ratingHigh) {
                ratingHigh = inputRating;
                highMovie = inputMovie;
            }
            if (inputRating < ratingLow) {
                ratingLow = inputRating;
                lowMovie = inputMovie;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", highMovie, ratingHigh);
        System.out.printf("%s is with lowest rating: %.1f%n", lowMovie, ratingLow);
        double averageRating = ratings / countMovies;
        System.out.printf("Average rating: %.1f%n", averageRating);
    }
}
