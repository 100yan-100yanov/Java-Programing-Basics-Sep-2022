package L05_WhileLoop.Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int maxNum = Integer.MIN_VALUE;

        while (!num.equals("Stop")) {
            int parseNum = Integer.parseInt(num);
            if (maxNum < parseNum) {
                maxNum = parseNum;
            }
            num = scanner.nextLine();
        }
        System.out.println(maxNum);
    }
}
