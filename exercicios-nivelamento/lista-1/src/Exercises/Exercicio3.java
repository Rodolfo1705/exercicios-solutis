package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {
    public static void run(){
        Divisor.printExercise(3);

        int number = InputHandler.getIntInput("Digite um número inteiro: ");
        List<Number> lowerPrimeNumbers = getLowerPrimeNumbers(number);

        System.out.println("Os números primos menores que " + number + " são: " + lowerPrimeNumbers);
    }

    private static List<Number> getLowerPrimeNumbers(int num){
        List<Number> lowerPrimeNumbers = new ArrayList<>();

        for (int currentNum = num; currentNum > 1; currentNum--){
            if (currentNum % 2 == 0 && currentNum != 2) continue;

            for(int currentReducedNum = (int) Math.sqrt(currentNum); currentReducedNum > 0; currentReducedNum--){
                if(currentReducedNum == 1){
                    lowerPrimeNumbers.add(currentNum);
                }else{
                    if(currentNum % currentReducedNum == 0){
                        break;
                    }
                }
            }
        }

        return lowerPrimeNumbers;
    }
}
