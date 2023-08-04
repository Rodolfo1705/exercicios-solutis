import java.util.Scanner;

public class Exercicio8 {
    public static void run(){
        Divisor.printExercise(8);

        int number = InputHandler.getIntInput("Digite um número: ");
        System.out.println(number + " é um número " + (isEven(number) ? "par": "impar"));
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
