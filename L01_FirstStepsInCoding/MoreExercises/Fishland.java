package L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double sprinklePrice = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double scadKg = Double.parseDouble(scanner.nextLine());
        int clamsKg = Integer.parseInt(scanner.nextLine());

        double bonitoPrice = mackerelPrice * 1.60 * bonitoKg;
        double scadPrice = sprinklePrice * 1.80 * scadKg;
        double clamsPrice = 7.50 * clamsKg;

        double totalPrice = bonitoPrice + scadPrice + clamsPrice;

        System.out.printf("%.2f", totalPrice);
    }
}
