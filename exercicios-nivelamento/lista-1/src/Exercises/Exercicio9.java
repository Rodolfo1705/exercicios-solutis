package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio9 {
    public static void run(){
        Divisor.printExercise(9);

        int radius = InputHandler.getIntInput("Digite o raio do círculo: ");

        System.out.print("O raio do círculo é: " + calculateCircleArea(radius));

    }

    private static long calculateCircleArea(int radius){
        long area = Math.round(Math.PI * (radius * radius));

        return area;
    }
}
