package L07_ExamPreparation;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int cinemaPercent = Integer.parseInt(scanner.nextLine());

        double totalProfit = price * tickets * days;
        double cinemaProfit = totalProfit * cinemaPercent / 100;
        double finalProfit = totalProfit - cinemaProfit;

        System.out.printf("The profit from the movie %s is %.2f lv.", movie, finalProfit);
    }
}
