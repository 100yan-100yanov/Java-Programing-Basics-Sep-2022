package L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstRunner = Integer.parseInt(scanner.nextLine());
        int secondRunner = Integer.parseInt(scanner.nextLine());
        int thirdRunner = Integer.parseInt(scanner.nextLine());

        int timeSeconds = firstRunner + secondRunner + thirdRunner;
        int timeMinutes = timeSeconds / 60;
        int secondsLeft = timeSeconds % 60;

        if (secondsLeft < 10) {
            System.out.printf(timeMinutes + ":0%d", secondsLeft);
        } else {
            System.out.printf("%d:%d", timeMinutes, secondsLeft);
        }

    }
}
