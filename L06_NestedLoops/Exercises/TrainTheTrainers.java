package L06_NestedLoops.Exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();
        double totalScore = 0;
        int presentationCount = 0;

        while (!presentationName.equals("Finish")) {
            presentationCount++;
            double sumScore = 0;

            for (int i = 1; i <= juryCount; i++) {
                double score = Double.parseDouble(scanner.nextLine());
                sumScore += score;
            }
            double average = sumScore / juryCount;
            totalScore += average;
            System.out.printf("%s - %.2f.%n", presentationName, average);
            presentationName = scanner.nextLine();
        }
        double totalAverage = totalScore / presentationCount;
        System.out.printf("Student's final assessment is %.2f.%n", totalAverage);
    }
}
