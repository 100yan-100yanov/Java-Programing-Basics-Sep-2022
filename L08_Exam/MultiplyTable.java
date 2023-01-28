package L08_Exam;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String intToString = "" + num;

        for (int i = 1; i <= num % 10; i++) {
            int digit = Integer.parseInt("" + intToString.charAt(1));

            for (int j = 1; j <= digit; j++) {
                if (j <= 0) {
                    continue;
                }

                for (int k = 0; k <= num / 100; k++) {
                    if (k <= 0) {
                        continue;
                    }
                    int result = k * j * i;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, result);
                }
            }
        }
    }
}
