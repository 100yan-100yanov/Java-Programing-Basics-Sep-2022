package L06_NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double minBudget = Double.parseDouble(scanner.nextLine());
            double moneyNeeded = 0;

            while (moneyNeeded < minBudget) {
                double savings = Double.parseDouble(scanner.nextLine());
                moneyNeeded += savings;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
