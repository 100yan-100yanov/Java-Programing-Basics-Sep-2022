package L05_WhileLoop.Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int minNum = Integer.MAX_VALUE;

        while (!num.equals("Stop")) {
            int parseNum = Integer.parseInt(num);
            if (minNum > parseNum) {
                minNum = parseNum;
            }
            num = scanner.nextLine();
        }
        System.out.println(minNum);
    }
}


