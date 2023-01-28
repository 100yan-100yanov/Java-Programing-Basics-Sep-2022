package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelQuantity = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double price = 0.0;

        switch (fuelType) {
            case "Gasoline":
                if (clubCard.equals("Yes")) {
                    price = fuelQuantity * 2.04;
                } else {
                    price = fuelQuantity * 2.22;
                }
                break;
            case "Diesel":
                if (clubCard.equals("Yes")) {
                    price = fuelQuantity * 2.21;
                } else {
                    price = fuelQuantity * 2.33;
                }
                break;
            case "Gas":
                if (clubCard.equals("Yes")) {
                    price = fuelQuantity * 0.85;
                } else {
                    price = fuelQuantity * 0.93;
                }
                break;
        }
        if (fuelQuantity > 25) {
            price = price * 0.90;
        } else if (fuelQuantity >= 20) {
            price = price * 0.92;
        }
        System.out.printf("%.2f lv.", price);
    }
}
