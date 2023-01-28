package L02_ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //square, rectangle, circle или triangle
        String figure = scanner.nextLine();
        double area = 0;

        //•	Ако фигурата е квадрат (square): едно дробно число - дължина на страната му
        //•	Ако фигурата е правоъгълник (rectangle): две дробни числа - дължините на страните
        //•	Ако фигурата е кръг (circle): едно дробно число - радиусът на кръга
        //•	Ако фигурата е триъгълник (triangle): две дробни числа - дължината на страната му и дължината на височината

        if (figure.equals("square")) {
            double length = Double.parseDouble(scanner.nextLine());
            area = length * length;

        } else if (figure.equals("rectangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            area = length * width;

        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = radius * radius * Math.PI;

        } else if (figure.equals("triangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = (length * height) / 2;
        }
        System.out.printf("%.3f", area);
    }
}
