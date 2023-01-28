package L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = length * width * height;
        double volumeAccessories = volume * (percent * 0.01);
        double totalVolume = volume - volumeAccessories;
        double liters = totalVolume * 0.001;

        System.out.println(liters);
    }
}
