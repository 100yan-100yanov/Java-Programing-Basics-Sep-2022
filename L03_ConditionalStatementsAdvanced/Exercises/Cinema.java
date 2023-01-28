package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String screening = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        int allSeats = rows * columns;
        double price = 0;

        switch (screening) {
            case "Premiere":
                price = allSeats * 12.00;
                break;
            case "Normal":
                price = allSeats * 7.50;
                break;
            case "Discount":
                price = allSeats * 5.00;
                break;
        }
        System.out.printf("%.2f leva", price);
    }
}
