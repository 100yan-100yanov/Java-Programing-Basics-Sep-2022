package L06_NestedLoops.Exercises;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i < 9999; i++) {
            String numFormat = "" + i;

            for (int j = 0; j < numFormat.length(); j++) {
                int digit = Integer.parseInt("" + numFormat.charAt(j));

                if (digit == 0) {
                    break;
                } else if (n % digit != 0) {
                    break;
                } else if (n % digit == 0 && j == 3) {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
