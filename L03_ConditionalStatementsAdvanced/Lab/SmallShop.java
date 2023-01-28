package L03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        switch (product) {

            case "coffee":
                if (city.equals("Sofia")) {
                    System.out.println(quantity * 0.50);
                } else if (city.equals("Plovdiv")) {
                    System.out.println(quantity * 0.40);
                } else {
                    System.out.println(quantity * 0.45);
                }
                break;
            case "water":
                if (city.equals("Sofia")) {
                    System.out.println(quantity * 0.80);
                } else if (city.equals("Plovdiv")) {
                    System.out.println(quantity * 0.70);
                } else {
                    System.out.println(quantity * 0.70);
                }
                break;
            case "beer":
                if (city.equals("Sofia")) {
                    System.out.println(quantity * 1.20);
                } else if (city.equals("Plovdiv")) {
                    System.out.println(quantity * 1.15);
                } else {
                    System.out.println(quantity * 1.10);
                }
                break;
            case "sweets":
                if (city.equals("Sofia")) {
                    System.out.println(quantity * 1.45);
                } else if (city.equals("Plovdiv")) {
                    System.out.println(quantity * 1.30);
                } else {
                    System.out.println(quantity * 1.35);
                }
                break;
            case "peanuts":
                if (city.equals("Sofia")) {
                    System.out.println(quantity * 1.60);
                } else if (city.equals("Plovdiv")) {
                    System.out.println(quantity * 1.50);
                } else {
                    System.out.println(quantity * 1.55);
                }
                break;

        }
    }
}
