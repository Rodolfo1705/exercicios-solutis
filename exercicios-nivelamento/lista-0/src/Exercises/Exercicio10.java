package Exercises;

import Utils.Divisor;

public class Exercicio10 {
    public static void run() {
        Divisor.printExercise(10);

        int num1 = 6;
        int num2 = 4;
        int num3 = num1 / num2;

        System.out.println("O valor da terceira variável é: " + num3);

        //O resultado será 1, pois como o tipo inferido das variáveis "num1", "num2" e "num3" é int. (um número inteiro sem casas decimais)
        //houve a remoção das casas decimais. Caso as variáveis estivessem com o tipo float. O resultado seria exibido corretamente (1.5).
    }
}
