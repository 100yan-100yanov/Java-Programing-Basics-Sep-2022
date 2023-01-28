package L08_Exam;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String review = scanner.nextLine();
        double roomPrice = 0.0;
        int nights = days - 1;

        switch (typeRoom) {
            case "room for one person":
                roomPrice = 18.00;
                break;
            case "apartment":
                roomPrice = 25.00;
                if (days < 10) {
                    roomPrice = roomPrice * 0.70;
                } else if (days > 15) {
                    roomPrice = roomPrice * 0.50;
                } else {
                    roomPrice = roomPrice * 0.65;
                }
                break;
            case "president apartment":
                roomPrice = 35.00;
                if (days < 10) {
                    roomPrice = roomPrice * 0.90;
                } else if (days > 15) {
                    roomPrice = roomPrice * 0.80;
                } else {
                    roomPrice = roomPrice * 0.85;
                }
                break;
        }
        double finalPrice = roomPrice * nights;
        if (review.equals("positive")) {
            finalPrice = finalPrice * 1.25;
        } else if (review.equals("negative")) {
            finalPrice = finalPrice * 0.90;
        }
        System.out.printf("%.2f", finalPrice);
    }
}
