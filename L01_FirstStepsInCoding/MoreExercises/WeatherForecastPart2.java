package L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());

        if (degrees <= 35 && degrees >= 26) {
            System.out.println("Hot");
        } else if (degrees <= 25.9 && degrees >= 20.1) {
            System.out.println("Warm");
        } else if (degrees <= 20 && degrees >= 15) {
            System.out.println("Mild");
        } else if (degrees <= 14.9 && degrees >= 12) {
            System.out.println("Cool");
        } else if (degrees <= 11.9 && degrees >= 5){
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}
