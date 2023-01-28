package L05_WhileLoop.Exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBadGrades = Integer.parseInt(scanner.nextLine());
        String taskName = scanner.nextLine();

        int badGrades = 0;
        int tasks = 0;
        double sumGrades = 0.0;
        String currentTaskName = "";

        while (!taskName.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            sumGrades = sumGrades + grade;

            if (grade <= 4) {
                badGrades++;
                tasks++;
                currentTaskName = taskName;
            } else {
                tasks++;
                currentTaskName = taskName;
            }

            if (taskName.equals("Enough")) {
                break;
            } else if (badGrades == maxBadGrades) {
                break;
            }
            taskName = scanner.nextLine();
        }
        if (badGrades == maxBadGrades) {
            System.out.printf("You need a break, %d poor grades.", badGrades);

        } else {
            double average = sumGrades / tasks;
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", tasks);
            System.out.printf("Last problem: %s", currentTaskName);
        }
    }
}

