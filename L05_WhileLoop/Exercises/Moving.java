package L05_WhileLoop.Exercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String boxesCount = scanner.nextLine();
        int totalSpace = length * width * height;
        int sumBoxes = 0;
        String lastInput = boxesCount;

        while (!boxesCount.equals("Done")) {
            int parsedBoxes = Integer.parseInt(boxesCount);
            sumBoxes = sumBoxes + parsedBoxes;

            if (sumBoxes >= totalSpace) {
                break;
            }
            boxesCount = scanner.nextLine();
            lastInput = boxesCount;
        }
        if (lastInput.equals("Done")) {
            System.out.printf("%d Cubic meters left.", totalSpace - sumBoxes);
        }
        if (sumBoxes > totalSpace) {
            System.out.printf("No more free space! You need %d Cubic meters more.", sumBoxes - totalSpace);
        }
    }
}

