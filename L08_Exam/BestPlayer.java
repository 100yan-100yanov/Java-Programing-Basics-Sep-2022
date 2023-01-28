package L08_Exam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        String bestPlayer = "";
        int playerGoals = 0;

        while (!command.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            String player = command;

            if (goals > playerGoals) {
                bestPlayer = player;
                playerGoals = goals;
            }
            if (goals >= 10) {
                break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);

        if (playerGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", playerGoals);
        } else {
            System.out.printf("He has scored %d goals.", playerGoals);
        }
    }
}
