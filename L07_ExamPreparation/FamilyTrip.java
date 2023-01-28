package L07_ExamPreparation;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int additionalCostPercent = Integer.parseInt(scanner.nextLine());

        if (nights > 7) {
            pricePerNight = pricePerNight * 0.95;
        }
        double price = nights * pricePerNight;
        double totalCost = price + (budget * additionalCostPercent / 100);

        if (budget >= totalCost) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalCost);
        } else {
            System.out.printf("%.2f leva needed.", totalCost - budget);
        }
    }
}
