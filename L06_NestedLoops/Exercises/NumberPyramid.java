package L06_NestedLoops.Exercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 1;
        boolean stop = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                if (count > n) {
                    stop = true;
                    break;
                }
                System.out.print(count + " ");
                count++;
            }
            if (stop) {
                break;
            }
            System.out.println();
        }
    }
}
