package L05_WhileLoop.Exercises;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double changeLv = Double.parseDouble(scanner.nextLine());
        double changeSt = Math.round(changeLv * 100);
        int coinsCount = 0;

        while (changeSt > 0) {
            if (changeSt >= 200) {
                changeSt -= 200;
                coinsCount++;
            } else if (changeSt >= 100) {
                changeSt -= 100;
                coinsCount++;
            } else if (changeSt >= 50) {
                changeSt -= 50;
                coinsCount++;
            } else if (changeSt >= 20) {
                changeSt -= 20;
                coinsCount++;
            } else if (changeSt >= 10) {
                changeSt -= 10;
                coinsCount++;
            } else if (changeSt >= 5) {
                changeSt -= 5;
                coinsCount++;
            } else if (changeSt >= 2) {
                changeSt -= 2;
                coinsCount++;
            } else if (changeSt >= 1) {
                changeSt -= 1;
                coinsCount++;
            }
        }
        System.out.println(coinsCount);
    }
}