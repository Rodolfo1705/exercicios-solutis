package Exercises;

import Utils.Divisor;
import java.text.DecimalFormat;


public class Exercicio6 {
    public static void run(){
        Divisor.printExercise(6);

        printOddProduct(15, 30);
    }

    private static void printOddProduct(int start, int end){
        float oddProduct = 1; //O resultado será preciso caso o tipo da variável fosse "long".

        for (int currentNum = start; currentNum <= end; currentNum++){
            if(currentNum % 2 != 0){
                oddProduct *= currentNum;
            }
        }
        DecimalFormat df = new DecimalFormat("#");

        String formattedNumber = df.format(oddProduct);

        System.out.println("O produto dos números ímpares entre " + start + " e " + end + " é: " + formattedNumber);
    }
}
