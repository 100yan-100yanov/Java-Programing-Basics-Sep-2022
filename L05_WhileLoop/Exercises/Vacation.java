package L05_WhileLoop.Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int allDays = 0;
        int daysSpending = 0;

        while (vacationMoney > currentMoney && daysSpending < 5) {

            String spendOrSave = scanner.nextLine();
            double moneyTransaction = Double.parseDouble(scanner.nextLine());
            allDays++;

            if (spendOrSave.equals("save")) {
                currentMoney = currentMoney + moneyTransaction;
                daysSpending = 0;

            } else if (spendOrSave.equals("spend")) {
                currentMoney = currentMoney - moneyTransaction;
                daysSpending++;
                if (currentMoney < 0) {
                    currentMoney = 0;
                }
            }
        }
        if (vacationMoney <= currentMoney) {
            System.out.printf("You saved the money for %d days.", allDays);
        }
        if (daysSpending == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", allDays);
        }
    }
}
