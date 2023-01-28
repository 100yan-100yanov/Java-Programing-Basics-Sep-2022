package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        double result = 0.0;

        switch (operation) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = 1.00 * n1 / n2;
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                }
                break;
        }
        if ((operation.equals("+") || operation.equals("-") || operation.equals("*")) && result % 2 == 0) {
            System.out.printf("%d %s %d = %.0f - even", n1, operation, n2, result);
        } else if ((operation.equals("+") || operation.equals("-") || operation.equals("*")) && result % 2 != 0) {
            System.out.printf("%d %s %d = %.0f - odd", n1, operation, n2, result);
        } else if (operation.equals("/") && n2 != 0) {
            System.out.printf("%d %s %d = %.2f", n1, operation, n2, result);
        } else if (operation.equals("%") && n2 != 0) {
            System.out.printf("%d %s %d = %.0f", n1, operation, n2, result);
        }
    }
}
