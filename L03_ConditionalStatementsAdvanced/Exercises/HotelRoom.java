package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0.0;
        double priceApartment = 0.0;

        switch (month) {
            case "May":
            case "October":
                if (nights > 7 && nights <= 14) {
                    priceStudio = 50 * 0.95;
                    priceApartment = 65;
                } else if (nights > 14) {
                    priceStudio = 50 * 0.70;
                    priceApartment = 65 * 0.90;
                } else {
                    priceStudio = 50;
                    priceApartment = 65;
                }
                break;
            case "June":
            case "September":
                if (nights > 14) {
                    priceStudio = 75.20 * 0.80;
                    priceApartment = 68.70 * 0.90;
                } else {
                    priceStudio = 75.20;
                    priceApartment = 68.70;
                }
                break;
            case "July":
            case "August":
                if (nights > 14) {
                    priceStudio = 76;
                    priceApartment = 77 * 0.90;
                } else {
                    priceStudio = 76;
                    priceApartment = 77;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", priceApartment * nights);
        System.out.printf("Studio: %.2f lv.", priceStudio * nights);
    }
}
