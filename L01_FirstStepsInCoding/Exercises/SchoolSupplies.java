package L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaning = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double pricePens = pens * 5.80;
        double priceMarkers = markers * 7.20;
        double priceCleaning = cleaning * 1.20;
        double priceAll = pricePens + priceMarkers + priceCleaning;
        double discount = priceAll * percent/100;
        double totalPrice = priceAll - discount;

        System.out.println(totalPrice);
    }
}
