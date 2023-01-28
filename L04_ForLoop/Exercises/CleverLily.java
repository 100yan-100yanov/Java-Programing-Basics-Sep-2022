package L04_ForLoop.Exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        int toys = 0;
        int money = 0;
        int evenBirthdays = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 1) {
                toys += 1;
            } else {
                money += i * 5;
                evenBirthdays += 1;
            }
        }
        int toyMoney = toys * pricePerToy;
        double subtractedMoney = evenBirthdays * 1.00;
        double totalMoney = toyMoney + money - subtractedMoney;
        if (totalMoney >= washingMachine) {
            System.out.printf("Yes! %.2f", totalMoney - washingMachine);
        } else {
            System.out.printf("No! %.2f", washingMachine - totalMoney);
        }
    }
}
