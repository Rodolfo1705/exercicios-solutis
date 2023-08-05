package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.util.ArrayList;
import java.util.List;

public class Exercicio7 {
    public static void run() {
        Divisor.printExercise(7);

        int a = InputHandler.getIntInput("Digite o valor a: ");
        int b = InputHandler.getIntInput("Digite o valor b: ");

        printValueBeforeSwap(a);
        printValueBeforeSwap(b);

        List<Number> valuesSwapped = swapVariablesValue(a, b);

        printValueAfterSwap(valuesSwapped.get(0).intValue());
        printValueAfterSwap(valuesSwapped.get(1).intValue());
    }

    private static List<Number> swapVariablesValue(int firstValue, int secondValue){
        int temp;
        List<Number> valuesSwapped = new ArrayList<>();

        temp = firstValue;
        firstValue = secondValue;
        secondValue = temp;

        valuesSwapped.add(firstValue);
        valuesSwapped.add(secondValue);

        return valuesSwapped;
    }

    private static void printValueBeforeSwap(int value){
        System.out.println("Valor de a antes da troca: " + value);
    }

    private static void printValueAfterSwap(int value){
        System.out.println("Valor de a depois da troca: " + value);
    }
}
