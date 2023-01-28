package L07_ExamPreparation;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        int hourPerDay = Integer.parseInt(scanner.nextLine());

        int dayNumber = 0;
        double totalFee = 0.0;

        for (int i = 1; i <= daysCount; i++) {
            dayNumber++;
            double sumFee = 0.0;

            for (int j = 1; j <= hourPerDay; j++) {

                if (i % 2 == 0 && j % 2 == 1) {
                    sumFee = sumFee + 2.50;
                } else if (i % 2 == 1 && j % 2 == 0) {
                    sumFee = sumFee + 1.25;
                } else {
                    sumFee = sumFee + 1.0;
                }
            }
            totalFee += sumFee;
            System.out.printf("Day: %d - %.2f leva%n", dayNumber, sumFee);
        }
        System.out.printf("Total: %.2f leva", totalFee);
    }
}
