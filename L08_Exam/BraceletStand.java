package L08_Exam;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double allowance = Double.parseDouble(scanner.nextLine());
        double sellProfit = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());
        double giftCost = Double.parseDouble(scanner.nextLine());

        double savedMoney = (5 * (allowance + sellProfit)) - expenses;
        if (savedMoney >= giftCost) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", savedMoney);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", giftCost - savedMoney);
        }
    }
}
