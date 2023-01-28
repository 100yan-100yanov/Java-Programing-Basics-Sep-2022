package L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;
        double secondBonus = 0;

        //Ако числото е до 100 включително, бонус точките са 5.
        //Ако числото е по-голямо от 100, бонус точките са 20% от числото.
        //Ако числото е по-голямо от 1000, бонус точките са 10% от числото.

        //За четно число  + 1 т.
        //За число, което завършва на 5  + 2 т.

        if (points <= 100) {
            bonusPoints = 5;

        } else if (points <= 1000) {
            bonusPoints = points * 0.20;

        } else {
            bonusPoints = points * 0.10;
        }
        if (points % 2 == 0) {
            secondBonus = 1;

        } else if (points % 10 == 5) {
            secondBonus = 2;
        }

        System.out.println(bonusPoints + secondBonus);
        System.out.println(bonusPoints + secondBonus + points);

    }
}
