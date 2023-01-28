package L04_ForLoop.Exercises;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int payCut = 0;

        for (int i = 1; i <= tabs; i++) {
            String website = scanner.nextLine();
            switch (website) {
                case "Facebook":
                    payCut += 150;
                    break;
                case "Instagram":
                    payCut += 100;
                    break;
                case "Reddit":
                    payCut += 50;
                    break;
            }
        }
        if (salary - payCut <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%d", salary - payCut);
        }
    }
}
