package L04_ForLoop.Exercises;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum = sum + num;
            if (num > maxNum) {
                maxNum = num;
            }
        }
        if (maxNum == (sum - maxNum)) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNum);
        } else {
            int diff = maxNum - (sum - maxNum);
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(diff));
        }
    }
}

