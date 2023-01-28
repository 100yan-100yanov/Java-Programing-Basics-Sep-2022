package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double price = 0;

        if (km >= 100) {
            price = 0.06 * km;
        } else if (km >= 20) {
            price = 0.09 * km;
        } else {
            if (dayOrNight.equals("day")) {
                price = 0.79 * km + 0.70;
            } else {
                price = 0.90 * km + 0.70;
            }
        }
        System.out.printf("%.2f%n", price);
    }
}
