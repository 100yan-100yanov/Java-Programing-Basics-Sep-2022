package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String review = scanner.nextLine();

        int nights = days - 1;
        double price = 0.0;

        switch (room) {
            case "room for one person":
                price = 18;
                break;
            case "apartment":
                price = 25;
                if (nights < 10) {
                    price = price * 0.70;
                } else if (nights > 15) {
                    price = price * 0.50;
                } else {
                    price = price * 0.65;
                }
                break;
            case "president apartment":
                price = 35;
                if (nights < 10) {
                    price = price * 0.90;
                } else if (nights > 15) {
                    price = price * 0.80;
                } else {
                    price = price * 0.85;
                    break;
                }
        }
        switch (review) {
            case "positive":
                price = price * 1.25;
                break;
            case "negative":
                price = price * 0.90;
                break;
        }
        double totalPrice = price * nights;
        System.out.printf("%.2f", totalPrice);
    }
}