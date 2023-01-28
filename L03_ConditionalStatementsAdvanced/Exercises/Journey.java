package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double moneyNeeded = 0.0;
        String destination = "";
        String vacationType = "";

        switch (season) {
            case "winter":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    vacationType = "Hotel";
                    moneyNeeded = budget * 0.70;
                } else if (budget > 100 && budget <= 1000) {
                    destination = "Balkans";
                    vacationType = "Hotel";
                    moneyNeeded = budget * 0.80;
                } else if (budget > 1000) {
                    destination = "Europe";
                    vacationType = "Hotel";
                    moneyNeeded = budget * 0.90;
                }
                break;
            case "summer":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    vacationType = "Camp";
                    moneyNeeded = budget * 0.30;
                } else if (budget > 100 && budget <= 1000) {
                    destination = "Balkans";
                    vacationType = "Camp";
                    moneyNeeded = budget * 0.40;
                } else if (budget > 1000) {
                    destination = "Europe";
                    vacationType = "Hotel";
                    moneyNeeded = budget * 0.90;
                }
                break;
        }
        System.out.println("Somewhere in " + destination);
        System.out.printf("%s - %.2f", vacationType, moneyNeeded);
    }
}
