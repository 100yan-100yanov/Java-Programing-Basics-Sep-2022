package L08_Exam;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countModels = Integer.parseInt(scanner.nextLine());
        int sumRating = 0;
        double sumSales = 0.0;

        for (int i = 1; i <= countModels; i++) {
            int salesOrRating = Integer.parseInt(scanner.nextLine());
            int rating = salesOrRating % 10;
            double sales = salesOrRating / 10;
            sumRating += rating;

            if (rating <= 2) {
                sales = 0;
            } else if (rating == 3) {
                sales = sales * 0.50;
            } else if (rating == 4) {
                sales = sales * 0.70;
            } else if (rating == 5) {
                sales = sales * 0.85;
            } else if (rating >= 6) {
                sales = sales;
            }
            sumSales = sumSales + sales;
        }
        double averageRating = 1.0 * sumRating / countModels;
        System.out.printf("%.2f%n", sumSales);
        System.out.printf("%.2f%n", averageRating);
    }
}
