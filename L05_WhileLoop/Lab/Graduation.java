package L05_WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();
        int year = 1;
        int fail = 0;
        double sum = 0;

        while (year <= 12) {
            if (fail > 1) {
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                fail++;
                continue;
            }
            sum = sum + grade;
            year++;
        }
        if (fail > 1) {
            System.out.printf("%s has been excluded at %d grade", student, year);
        } else {
            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", student, average);
        }
    }
}


