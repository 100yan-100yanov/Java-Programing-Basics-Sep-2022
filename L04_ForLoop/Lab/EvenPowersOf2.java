package L04_ForLoop.Lab;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(number);
                number = number * 2 * 2;
            }
        }
    }
}
