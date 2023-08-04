public class Exercicio9 {
    public static void run(){
        Divisor.printExercise(9);

        for (int currentNumber = 0; currentNumber <= 10; currentNumber++){
            int power = currentNumber * currentNumber;
            System.out.println("O quadrado de " + currentNumber + " é: " + power);
        }
    }
}
