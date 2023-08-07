package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio11 {
    public static void run(){
        Divisor.printExercise(11);

        String firstWord = InputHandler.getStringInput("Digite uma palavra: ");
        String secondWord = InputHandler.getStringInput("Digite outra palavra: ");

        printInAlphabeticOrder(firstWord, secondWord);
        printWhichWordIsLarger(firstWord, secondWord);
    }

    private static void printInAlphabeticOrder(String firstWord, String secondWord){
        int comparasionResult = firstWord.compareTo(secondWord);

        if (comparasionResult < 0) {
            System.out.println("Palavras em ordem alfabética: " + firstWord + ", " + secondWord);
            return;
        } if (comparasionResult > 0) {
            System.out.println("Palavras em ordem alfabética: " + secondWord + ", " + firstWord);
            return;
        }
        System.out.println("As palavras são iguais");
    }

    private static void printWhichWordIsLarger(String firstWord, String secondWord){
        String largerWord = firstWord;

        if(firstWord.length() < secondWord.length()){
            largerWord = secondWord;
        }

        System.out.println("A palavra com maior quantidade de caracteres é: " + largerWord);
    }
}
