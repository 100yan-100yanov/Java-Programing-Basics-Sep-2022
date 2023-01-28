package L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Пилешко меню –  10.35 лв.
        //Меню с риба – 12.40 лв.
        //Вегетарианско меню  – 8.15 лв.

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veggieMenu = Integer.parseInt(scanner.nextLine());

        double priceChicken = chickenMenu * 10.35;
        double priceFish = fishMenu * 12.40;
        double priceVeggie = veggieMenu * 8.15;
        double priceDessert = (priceChicken + priceFish + priceVeggie) * 0.20;
        double priceDelivery = 2.50;

        System.out.println(priceChicken + priceFish + priceVeggie + priceDessert + priceDelivery);
    }
}
