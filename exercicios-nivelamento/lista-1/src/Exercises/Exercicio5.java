package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {
    public static void run(){
        Divisor.printExercise(5);

        int number = InputHandler.getIntInput("Digite um número de 1 à 7: ");

        System.out.println("O dia " + number + " da semana correspondente é: " + getDayOfTheWeek(number));
    }
    private static String getDayOfTheWeek(int day){
        List<String> daysOfTheWeek = new ArrayList<>();

        daysOfTheWeek.add("Segunda-Feira");
        daysOfTheWeek.add("Terça-Feira");
        daysOfTheWeek.add("Quarta-Feira");
        daysOfTheWeek.add("Quinta-Feira");
        daysOfTheWeek.add("Sexta-Feira");
        daysOfTheWeek.add("Sábado");
        daysOfTheWeek.add("Domingo");

        return daysOfTheWeek.get(day - 1);
    }
}
