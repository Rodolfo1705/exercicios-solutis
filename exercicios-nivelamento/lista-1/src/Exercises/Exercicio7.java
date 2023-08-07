package Exercises;

import Utils.Divisor;

public class Exercicio7 {
    public static void run(){
        Divisor.printExercise(7);

        printHalfNumbersDivisibleByThreeValue(1, 100);
    }

    private static void printHalfNumbersDivisibleByThreeValue(int start, int end){
        for(double currentNumber = start; currentNumber <= end; currentNumber++){
            if(currentNumber % 3 == 0){
                System.out.println(currentNumber / 2);
            }
        }
    }
}
