package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio2 {
    public static void run(){
        Divisor.printExercise(2);

        int firstValue = InputHandler.getIntInput("Digite um valor: ");
        int secondValue = InputHandler.getIntInput("Digite outro valor: ");

        int higherValue = getHigherValue(firstValue, secondValue);

        System.out.println("O maior valor entre " + firstValue + " e " + secondValue + " é: " + higherValue);
    }

    private static int getHigherValue(int firstValue, int secondValue){
        int higherValue = firstValue;

        if (secondValue > firstValue) higherValue = secondValue;

        return higherValue;
    }
}
