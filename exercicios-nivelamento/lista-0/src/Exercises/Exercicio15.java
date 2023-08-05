package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio15 {
    public static void run() {
        Divisor.printExercise(15);

        int valuesSum = getInputedValuesSum(49);

        System.out.println("O resultado da soma dos valores é: " + valuesSum);
    }

    private static int getInputedValuesSum(int times){
        int iterationCounter = 0;
        int resultCounter = 0;

        do {
            resultCounter += InputHandler.getIntInput("Digite um valor: ");
            iterationCounter++;
        } while (iterationCounter < times);

        return resultCounter;
    }
}
