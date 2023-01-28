package L04_ForLoop.Lab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int textLength = text.length();

        for (int i = 0; i < textLength; i++) {
            char symbol = text.charAt(i);
            System.out.println(symbol);
        }
    }
}
