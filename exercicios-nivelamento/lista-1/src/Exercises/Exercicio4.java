package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio4 {
    public static void run(){
        Divisor.printExercise(4);

        double milesDistance = InputHandler.getDoubleInput("Digite a distância em milhas: ");
        double kmDistance = convertMilesToKm(milesDistance);

        System.out.println("A distância de " + milesDistance + " milhas em km é igual a: " + kmDistance + "km");
    }

    private static double convertMilesToKm(double milesDistance){
        return milesDistance * 1.609;
    }
}
