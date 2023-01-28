package L07_ExamPreparation;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String apparatus = scanner.nextLine();

        double difficulty = 0;
        double performance = 0;

        switch (country) {
            case "Bulgaria":
                if (apparatus.equals("ribbon")) {
                    difficulty = 9.600;
                    performance = 9.400;
                } else if (apparatus.equals("hoop")) {
                    difficulty = 9.550;
                    performance = 9.750;
                } else {
                    difficulty = 9.500;
                    performance = 9.400;
                }
                break;
            case "Russia":
                if (apparatus.equals("ribbon")) {
                    difficulty = 9.100;
                    performance = 9.400;

                } else if (apparatus.equals("hoop")) {
                    difficulty = 9.300;
                    performance = 9.800;
                } else {
                    difficulty = 9.600;
                    performance = 9.000;
                }
                break;
            case "Italy":
                if (apparatus.equals("ribbon")) {
                    difficulty = 9.200;
                    performance = 9.500;

                } else if (apparatus.equals("hoop")) {
                    difficulty = 9.450;
                    performance = 9.350;
                } else {
                    difficulty = 9.700;
                    performance = 9.150;
                }
                break;
        }
        double score = difficulty + performance;
        double remainder = 20 - score;
        double percent = remainder / 20 * 100;

        System.out.printf("The team of %s get %.3f on %s.%n", country, score, apparatus);
        System.out.printf("%.2f%%", percent);
    }
}
