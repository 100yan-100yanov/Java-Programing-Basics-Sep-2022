package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (season) {
            case "Spring":
                if (fishermen <= 6) {
                    price = 3000 * 0.9;
                } else if (fishermen > 7 && fishermen <= 12) {
                    price = 3000 * 0.85;
                } else if (fishermen > 12) {
                    price = 3000 * 0.75;
                }
                break;
            case "Summer":
            case "Autumn":
                if (fishermen <= 6) {
                    price = 4200 * 0.9;
                } else if (fishermen > 7 && fishermen <= 12) {
                    price = 4200 * 0.85;
                } else if (fishermen > 12) {
                    price = 4200 * 0.75;
                }
                break;
            case "Winter":
                if (fishermen <= 6) {
                    price = 2600 * 0.9;
                } else if (fishermen > 7 && fishermen <= 12) {
                    price = 2600 * 0.85;
                } else if (fishermen > 12) {
                    price = 2600 * 0.75;
                }
                break;
        }
        if (fishermen % 2 == 0 && !(season.equals("Autumn"))) {
            price = price * 0.95;
        }
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}
