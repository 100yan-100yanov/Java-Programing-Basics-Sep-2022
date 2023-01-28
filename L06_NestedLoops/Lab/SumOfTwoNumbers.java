package L06_NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean flag = false;

        for (int i = startNum; i <= endNum; i++) {
            for (int j = startNum; j <= endNum; j++) {
                count++;
                if (i + j == magicNum) {
                    flag = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, j, magicNum);
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d%n", count, magicNum);
        }
    }
}
