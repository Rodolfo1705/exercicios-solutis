package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.util.Arrays;
import java.util.List;

public class Exercicio10 {
    private static List<String> vowels = Arrays.stream(new String[]{"a", "e", "i", "o", "u"}).toList();

    public static void run(){
        Divisor.printExercise(10);

        String text = InputHandler.getStringInput("Digite uma frase: ");

        System.out.println("A quantidade de vogais é: " + vowelCounter(text));
        System.out.println("A quantidade de consoantes é: " + consonantCounter(text));
        System.out.println("A quantiade de espaços em branco é: " + whiteSpacesCounter(text));
    }

    private static int vowelCounter(String text){
        int counter = 0;

        for(int i = 0; i < text.length(); i++){
            if(vowels.contains(String.valueOf(text.charAt(i)))){
                counter++;
            }
        }

        return counter;
    }

    private static int consonantCounter(String text){
        int counter = 0;

        for(int i = 0; i < text.length(); i++){
            String currentChar = String.valueOf(text.charAt(i));

            if(!vowels.contains(currentChar) && !currentChar.equals(" ")){
                counter++;
            }
        }

        return counter;
    }

    private static int whiteSpacesCounter(String text){
        int counter = 0;

        for(int i = 0; i < text.length(); i++){
            String currentChar = String.valueOf(text.charAt(i));

            if(currentChar.equals(" ")){
                counter++;
            }
        }

        return counter;
    }
}
