package L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double time = distance * timePerMeter;
        double delay = Math.floor(distance / 15) * 12.5;

        if ((time + delay) < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time + delay);

        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", (time + delay) - record);
        }
    }
}
