package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio8 {
    public static void run(){
        Divisor.printExercise(8);

        String word = InputHandler.getStringInput("Digite uma palavra: ");

        System.out.println(isReadableBackwards(word));
    }

    private static String isReadableBackwards(String word){
        String reverseWord = "";

        for (int i = word.length() - 1; i >= 0; i--){
            reverseWord += word.charAt(i);
        }

        if (reverseWord.equals(word)) return "É possível ser lida de trás para frente!";

        return "Não é possível ser lida de trás para frente... :(";
    }
}
