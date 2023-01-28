package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (flowerType) {
            case "Roses":
                if (countFlowers > 80) {
                    price = countFlowers * (5 * 0.9);
                } else {
                    price = countFlowers * 5;
                }
                break;
            case "Dahlias":
                if (countFlowers > 90) {
                    price = countFlowers * (3.80 * 0.85);
                } else {
                    price = countFlowers * 3.80;
                }
                break;
            case "Tulips":
                if (countFlowers > 80) {
                    price = countFlowers * (2.80 * 0.85);
                } else {
                    price = countFlowers * 2.80;
                }
                break;
            case "Narcissus":
                if (countFlowers < 120) {
                    price = countFlowers * (3 * 1.15);
                } else {
                    price = countFlowers * 3;
                }
                break;
            case "Gladiolus":
                if (countFlowers < 80) {
                    price = countFlowers * (2.50 * 1.2);
                } else {
                    price = countFlowers * 2.50;
                }
                break;
        }
        double moneyLeft = budget - price;
        if (moneyLeft >= 0) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    countFlowers, flowerType, moneyLeft);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(moneyLeft));
        }
    }
}
