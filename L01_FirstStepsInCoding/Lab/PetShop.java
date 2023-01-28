package L01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
        double totalPrice = (dogFood * 2.50) + (catFood * 4);

        System.out.println(totalPrice + " lv.");
    }
}
