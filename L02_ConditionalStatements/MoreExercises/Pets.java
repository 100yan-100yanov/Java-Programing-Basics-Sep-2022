package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysGone = Integer.parseInt(scanner.nextLine());
        int kgFood = Integer.parseInt(scanner.nextLine());
        double kgDog = Double.parseDouble(scanner.nextLine());
        double kgCat = Double.parseDouble(scanner.nextLine());
        double gTurtle = Double.parseDouble(scanner.nextLine());

        double dogFood = kgDog * daysGone;
        double catFood = kgCat * daysGone;
        double turtleFood = gTurtle / 1000 * daysGone;
        double totalFood = dogFood + catFood + turtleFood;
        double difference = Math.abs(totalFood - kgFood);

        if (kgFood >= totalFood) {
            System.out.printf("%.0f kilos of food left.%n", Math.floor(difference));
        } else {
            System.out.printf("%.0f more kilos of food are needed.%n", Math.ceil(difference));
        }
    }
}
