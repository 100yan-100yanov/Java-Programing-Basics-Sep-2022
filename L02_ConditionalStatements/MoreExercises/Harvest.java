package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squareMeters = Integer.parseInt(scanner.nextLine());
        double grapePerSquareMeter = Double.parseDouble(scanner.nextLine());
        int neededWine = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());

        double totalGrape = grapePerSquareMeter * squareMeters;
        double grapeForWine = totalGrape * 0.40;
        double litersWine = grapeForWine / 2.5;
        double difference = Math.abs(litersWine - neededWine);

        if (litersWine < neededWine) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(difference));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(litersWine));
            System.out.printf("%.0f liters left -> %.0f liters per person.%n", Math.ceil(difference), Math.ceil(difference / workersCount));
        }
    }
}
