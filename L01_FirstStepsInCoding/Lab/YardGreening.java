package L01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        double price = area * 7.61;
        double discount = price * 0.18;
        double totalPrice = price - discount;

        System.out.println("The final price is: " + totalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");

    }
}
