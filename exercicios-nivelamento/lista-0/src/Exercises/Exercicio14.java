package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio14 {
    public static void run() {
        Divisor.printExercise(14);

        int iterationCounter = 0;
        int resultCounter = 0;

        while (iterationCounter < 50){
            resultCounter += InputHandler.getIntInput("Digite um valor: ");
            iterationCounter++;
        }
        System.out.println("O resultado da soma dos valores é: " + resultCounter);
    }
}
