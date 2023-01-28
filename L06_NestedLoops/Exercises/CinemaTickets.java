package L06_NestedLoops.Exercises;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double student = 0.0;
        double standard = 0.0;
        double kid = 0.0;
        int totalTickets = 0;

        while (!input.equals("Finish")) {
            String movie = input;
            int seats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            double seatsTaken = 0.0;

            while (!ticketType.equals("End")) {
                switch (ticketType) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }
                seatsTaken++;
                totalTickets++;

                if (seatsTaken == seats) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie, seatsTaken / seats * 100);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n",student / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kid / totalTickets * 100);
    }
}
