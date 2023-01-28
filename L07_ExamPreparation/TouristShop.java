package L07_ExamPreparation;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String productName = scanner.nextLine();

        double sumPrice = 0.0;
        int count = 0;

        while (!productName.equals("Stop")) {
            double productPrice = Double.parseDouble(scanner.nextLine());
            count++;

            if (count % 3 == 0) {
                productPrice = productPrice / 2;
            }
            sumPrice += productPrice;

            if (sumPrice > budget) {
                break;
            }
            productName = scanner.nextLine();
        }
        if (sumPrice > budget) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", sumPrice - budget);
        } else {
            System.out.printf("You bought %d products for %.2f leva.%n", count, sumPrice);
        }
    }
}
