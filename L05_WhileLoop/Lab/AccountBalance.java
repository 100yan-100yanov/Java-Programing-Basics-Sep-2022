package L05_WhileLoop.Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String deposit = scanner.nextLine();
        double total = 0;
        while (!deposit.equals("NoMoreMoney")) {
            double parseDeposit = Double.parseDouble(deposit);

            if (parseDeposit < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", parseDeposit);
            total = total + parseDeposit;
            deposit = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", total);
    }
}
