package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio11 {
    public static void run() {
        Divisor.printExercise(11);

        int code = InputHandler.getIntInput("Digite o código do produto: ");
        String product = getProduct(code);

        System.out.println("O produto selecionado foi: " + product);
    }

    private static String getProduct(int code) {
        if (code == 1) return "Parafuso";
        if (code == 2) return "Porca";
        if (code == 3) return "Prego";
        return "Diversos";
    }
}
