package L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double area = r * r * Math.PI;
        double perimeter = r * 2 * Math.PI;

        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f%n", perimeter);
    }
}
