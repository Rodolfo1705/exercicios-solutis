package Utils;

import java.util.Scanner;

public class InputHandler {
    public static int getIntInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        int input = scanner.nextInt();

        return input;
    }

    public static double getDoubleInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        double input = scanner.nextDouble();

        return input;
    }
}
