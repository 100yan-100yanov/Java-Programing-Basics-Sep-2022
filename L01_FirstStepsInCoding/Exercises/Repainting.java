package L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Предпазен найлон - 1.50 лв. за кв. метър
        //Боя - 14.50 лв. за литър
        //Разредител за боя - 5.00 лв. за литър

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int diluent = Integer.parseInt(scanner.nextLine());
        int hoursWorkers = Integer.parseInt(scanner.nextLine());

        double priceNylon = (nylon + 2) * 1.50;
        double pricePaint = (paint * 1.10) * 14.50;
        double priceDiluent = diluent * 5;
        double priceBags = 0.40;
        double priceMaterials = priceNylon + pricePaint + priceDiluent + priceBags;
        double payWorkers = (priceMaterials * 0.30) * hoursWorkers;
        double total = priceMaterials + payWorkers;

        System.out.println(total);

    }
}
