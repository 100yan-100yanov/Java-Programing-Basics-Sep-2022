package L01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Изготвянето на един проект отнема три часа
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int time = projects * 3;
        System.out.printf("The architect %s will need %d hours" +
                " to complete %d project/s.", name, time, projects);


    }
}
