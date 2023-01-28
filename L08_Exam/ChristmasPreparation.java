package L08_Exam;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paperCount = Integer.parseInt(scanner.nextLine());
        int clothCount = Integer.parseInt(scanner.nextLine());
        double glueLiters = Double.parseDouble(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double price = (paperCount * 5.80) + (clothCount * 7.20) + (glueLiters * 1.20);
        double discount = price * discountPercent / 100;
        double finalPrice = price - discount;

        System.out.printf("%.3f", finalPrice);
    }
}
