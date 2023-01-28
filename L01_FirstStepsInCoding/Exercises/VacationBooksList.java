package L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesPerBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysPerBook = Integer.parseInt(scanner.nextLine());

        int hoursPerBook = pagesPerBook / pagesPerHour;
        int hoursPerDay = hoursPerBook / daysPerBook;

        System.out.println(hoursPerDay);
    }
}
