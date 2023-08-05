package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio14 {
    public static void run() {
        Divisor.printExercise(14);

        int valuesSum = getInputedValuesSum(50);

        System.out.println("O resultado da soma dos valores é: " + valuesSum);
    }

    private static int getInputedValuesSum(int times){
        int iterationCounter = 0;
        int resultCounter = 0;

        while (iterationCounter < times){
            resultCounter += InputHandler.getIntInput("Digite um valor: ");
            iterationCounter++;
        }

        return resultCounter;
    }
}
