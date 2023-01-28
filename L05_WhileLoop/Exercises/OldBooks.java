package L05_WhileLoop.Exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String faveBook = scanner.nextLine();
        String bookName = scanner.nextLine();
        int books = 0;

        while (!bookName.equals(faveBook)) {
            if (bookName.equals("No More Books")) {
                break;
            } else {
                books++;
                bookName = scanner.nextLine();
            }
        }
        if (bookName.equals(faveBook)) {
            System.out.printf("You checked %d books and found it.", books);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", books);
        }
    }
}
