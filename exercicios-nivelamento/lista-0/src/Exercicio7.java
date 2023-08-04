import java.util.Scanner;

public class Exercicio7 {
    public static void run(){
        Divisor.printExercise(7);

        int a = InputHandler.getIntInput("Digite o valor a: ");
        int b = InputHandler.getIntInput("Digite o valor b: ");
        int temp;

        System.out.println("Valor de a antes da troca: " + a);
        System.out.println("Valor de b antes da troca: " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Valor de a depois da troca: " + a);
        System.out.println("Valor de b depois da troca: " + b);
    }
}
