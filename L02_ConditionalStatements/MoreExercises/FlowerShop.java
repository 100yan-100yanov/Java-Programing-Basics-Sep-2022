package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double magnoliasPrice = magnolias * 3.25;
        double hyacinthsPrice = hyacinths * 4;
        double rosesPrice = roses * 3.50;
        double cactiPrice = cacti * 8;
        double sumPrice = magnoliasPrice + hyacinthsPrice + rosesPrice + cactiPrice;
        double totalPrice = sumPrice * 0.95;
        double difference = Math.abs(totalPrice - giftPrice);

        if (totalPrice >= giftPrice) {
            System.out.printf("She is left with %.0f leva.%n", Math.floor(difference));
        } else {
            System.out.printf("She will have to borrow %.0f leva.%n", Math.ceil(difference));
        }
    }
}
