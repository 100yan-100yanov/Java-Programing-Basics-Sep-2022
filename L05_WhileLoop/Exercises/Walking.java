package L05_WhileLoop.Exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalSteps = 0;
        String lastInput = input;

        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            totalSteps = totalSteps + steps;

            if (totalSteps >= 10000) {
                break;
            }
            input = scanner.nextLine();
            lastInput = input;
        }
        if (lastInput.equals("Going home")) {
            totalSteps = totalSteps + Integer.parseInt(scanner.nextLine());
        }

        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalSteps - 10000);
        } else if (totalSteps < 10000) {
            System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
        }
    }
}
