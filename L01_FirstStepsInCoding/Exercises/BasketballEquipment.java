package L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        int yearFee = Integer.parseInt(scanner.nextLine());

        double priceShoes = yearFee - 0.4 * yearFee;
        double priceClothes = priceShoes - 0.2 * priceShoes;
        double priceBall = priceClothes / 4;
        double priceAccessories = priceBall / 5;
        double totalPrice = priceShoes + priceClothes + priceBall + priceAccessories;

        System.out.println(yearFee + totalPrice);
    }
}
