package L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double door = 1.20 * 2;
        double window = 1.50 * 1.50;
        double roof = (x * h) + (x * y * 2);
        double walls = (x * x * 2) + (x * y * 2) - (2 * window + door);

        double greenPaint = walls / 3.40;
        double redPaint = roof / 4.30;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }
}
