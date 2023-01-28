package L01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String greeting = "Hello, ";
        String name = scanner.nextLine();
        String exMark = "!";

        System.out.println(greeting + name + exMark);

    }
}
