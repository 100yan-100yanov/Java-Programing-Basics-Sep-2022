package L04_ForLoop.Exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());
        double totalPoints = academyPoints;

        for (int i = 1; i <= jury; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());
            totalPoints = totalPoints + ((juryName.length() * juryPoints) / 2);
            if (totalPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, totalPoints);
                jury = 0;
            }
        }
        if (totalPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - totalPoints);
        }
    }
}
