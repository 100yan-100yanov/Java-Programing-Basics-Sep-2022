package L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceFruits = Double.parseDouble(scanner.nextLine());
        double priceVegetables = Double.parseDouble(scanner.nextLine());
        int weightFruits = Integer.parseInt(scanner.nextLine());
        int weightFVegetables = Integer.parseInt(scanner.nextLine());

        double totalPriceFr = (priceFruits * weightFruits) / 1.94;
        double totalPriceVe = (priceVegetables * weightFVegetables) / 1.94;
        System.out.printf("%.2f", totalPriceFr + totalPriceVe);
    }
}
