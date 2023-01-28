package L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int gpu = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        //•	Видеокарта – 250 лв./бр.
        //•	Процесор – 35% от цената на закупените видеокарти/бр.
        //•	Рам памет – 10% от цената на закупените видеокарти/бр.

        double gpuPrice = gpu * 250;
        double cpuPrice = cpu * (gpuPrice * 0.35);
        double ramPrice = ram * (gpuPrice * 0.10);
        double price = gpuPrice + cpuPrice + ramPrice;

        if (gpu > cpu) {
            price = price * 0.85;
        }

        if (budget >= price) {
            System.out.printf("You have %.2f leva left!", budget - price);

        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", price - budget);
        }
    }
}
