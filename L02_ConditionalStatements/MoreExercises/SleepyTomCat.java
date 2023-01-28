package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freeDays = Integer.parseInt(scanner.nextLine());

        int sleepingNorm = 30000;
        int workDays = 365 - freeDays;
        int playTime = (workDays * 63) + (freeDays * 127);
        int difference = playTime - sleepingNorm;

        if (playTime > sleepingNorm) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", difference / 60, difference % 60);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", Math.abs(difference) / 60, Math.abs(difference) % 60);
        }
    }
}
