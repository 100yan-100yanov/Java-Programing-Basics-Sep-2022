package L04_ForLoop.Exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kalimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= groups; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            if (peopleInGroup <= 5) {
                musala += peopleInGroup;
            } else if (peopleInGroup >= 6 && peopleInGroup <= 12) {
                monblan += peopleInGroup;
            } else if (peopleInGroup >= 13 && peopleInGroup <= 25) {
                kalimanjaro += peopleInGroup;
            } else if (peopleInGroup >= 26 && peopleInGroup <= 40) {
                k2 += peopleInGroup;
            } else {
                everest += peopleInGroup;
            }
        }
        double totalPeople = (musala + monblan + kalimanjaro + k2 + everest) * 1.0;
        System.out.printf("%.2f%%%n", (musala / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (monblan / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (kalimanjaro / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (k2 / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (everest / totalPeople) * 100);
    }
}
