package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volumePool = Integer.parseInt(scanner.nextLine());
        int flowPipeOne = Integer.parseInt(scanner.nextLine());
        int flowPipeTwo = Integer.parseInt(scanner.nextLine());
        double hoursAway = Double.parseDouble(scanner.nextLine());

        double volumePipeOne = flowPipeOne * hoursAway;
        double volumePipeTwo = flowPipeTwo * hoursAway;
        double volumePipes = volumePipeOne + volumePipeTwo;

        //До колко се е запълнил басейна и коя тръба с колко процента е допринесла.
        //- "The pool is {запълненост на басейна в проценти}% full. Pipe 1: {процент вода от първата тръба}%. Pipe 2: {процент вода от втората тръба}%."
        //- "For {часовете, които тръбите са пълнили вода} hours the pool overflows with {литрите вода в повече} liters."

        if (volumePipes <= volumePool) {
            double percentagePipeOne = (volumePipeOne / volumePipes) * 100;
            double percentagePipeTwo = (volumePipeTwo / volumePipes) * 100;
            double percentagePool = volumePipes / volumePool * 100;
            String percent = "%";

            System.out.printf("The pool is %.2f%s full. Pipe 1: %.2f%s. Pipe 2: %.2f%s.", percentagePool, percent, percentagePipeOne, percent, percentagePipeTwo, percent);

        } else {
            double excessLiters = volumePipes - volumePool;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hoursAway, excessLiters);
        }
    }
}
