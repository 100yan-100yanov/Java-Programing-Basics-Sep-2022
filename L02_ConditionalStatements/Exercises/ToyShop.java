package L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationMoney = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int teddy = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());
        int countToys = puzzle + doll + teddy + minion + truck;

        //•	Пъзел - 2.60 лв.
        //•	Говореща кукла - 3 лв.
        //•	Плюшено мече - 4.10 лв.
        //•	Миньон - 8.20 лв.
        //•	Камионче - 2 лв.

        double puzzlePrice = puzzle * 2.60;
        double dollPrice = doll * 3;
        double teddyPrice = teddy * 4.10;
        double minionPrice = minion * 8.20;
        double truckPrice = truck * 2;
        double priceToys = puzzlePrice + dollPrice + teddyPrice + minionPrice + truckPrice;
        double totalPrice = 0;

        if (countToys >= 50) {
            totalPrice = priceToys - (priceToys * 0.25);
        } else {
            totalPrice = priceToys;
        }

        double finalPrice = totalPrice - (totalPrice * 0.10);

        if (finalPrice >= vacationMoney) {
            double moneyLeft = finalPrice - vacationMoney;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            double moneyNeeded = vacationMoney - finalPrice;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
        }
    }
}
