package L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputHour = Integer.parseInt(scanner.nextLine());
        int inputMinutes = Integer.parseInt(scanner.nextLine());
        int hour = 0;
        int minutes = 0;
        int convertedMinutes = (inputMinutes + 15) / 60;

        if ((inputHour + convertedMinutes) >= 24) {
            hour = ((inputHour + convertedMinutes) - 24);
        } else {
            hour = inputHour + convertedMinutes;
        }

        if ((inputMinutes + 15) >= 59) {
            minutes = ((inputMinutes + 15) % 60);
        } else {
            minutes = inputMinutes + 15;
        }

        if (minutes <= 9) {
            System.out.printf("%d:0%d", hour, minutes);
        } else {
            System.out.printf("%d:%d", hour, minutes);
        }
    }

}

