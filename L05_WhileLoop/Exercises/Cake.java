package L05_WhileLoop.Exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        String piecesTaken = scanner.nextLine();
        int totalPieces = length * width;
        int sumPieces = 0;
        String lastInput = piecesTaken;

        while (!piecesTaken.equals("STOP")) {
            int parsedPieces = Integer.parseInt(piecesTaken);
            sumPieces = sumPieces + parsedPieces;

            if (sumPieces >= totalPieces) {
                break;
            }
            piecesTaken = scanner.nextLine();
            lastInput = piecesTaken;
        }
        if (lastInput.equals("STOP")) {
            System.out.printf("%d pieces are left.", totalPieces - sumPieces);
        }
        if (sumPieces > totalPieces) {
            System.out.printf("No more cake left! You need %d pieces more.", sumPieces - totalPieces);
        }
    }
}
