package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio8 {
    public static void run() {
        Divisor.printExercise(8);

        int number = InputHandler.getIntInput("Digite um número: ");
        System.out.println(number + " é um número " + (isEven(number) ? "par" : "impar"));
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
