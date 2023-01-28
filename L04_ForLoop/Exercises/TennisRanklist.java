package L04_ForLoop.Exercises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int totalPoints = startingPoints;
        int wins = 0;

        for (int i = 1; i <= tournaments; i++) {
            String rank = scanner.nextLine();
            switch (rank) {
                case "W":
                    totalPoints += 2000;
                    wins += 1;
                    break;
                case "F":
                    totalPoints += 1200;
                    break;
                case "SF":
                    totalPoints += 720;
                    break;
            }
        }
        double average = (totalPoints - startingPoints) / tournaments;
        double winPercent = (1.00 * wins / tournaments) * 100;
        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(average));
        System.out.printf("%.2f%%", winPercent);
    }
}
