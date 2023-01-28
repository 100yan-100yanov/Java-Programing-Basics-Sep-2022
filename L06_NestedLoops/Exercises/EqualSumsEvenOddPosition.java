package L06_NestedLoops.Exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());


        for (int i = first; i <= second; i++) {
            String number = "" + i;
            int sumOdd = 0;
            int sumEven = 0;

            for (int j = 0; j < number.length(); j++) {
                int digit = Integer.parseInt("" + number.charAt(j));
                if (j % 2 == 0) {
                    sumEven += digit;
                } else {
                    sumOdd += digit;
                }
            }
            if (sumEven == sumOdd) {
                System.out.print(" " + i);
            }
        }
    }
}
