package L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String showName = scanner.nextLine();
        int showTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunch = breakTime / 8.0;
        double leisure = breakTime / 4.0;
        double timeLeft = breakTime * 1.0 - leisure - lunch;

        if (showTime <= timeLeft) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", showName, Math.ceil(timeLeft - showTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", showName, Math.ceil(showTime - timeLeft));
        }
    }
}
