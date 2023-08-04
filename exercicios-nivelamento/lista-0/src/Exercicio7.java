import java.util.Scanner;

public class Exercicio7 {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o vlaor a: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor b: ");
        int b = scanner.nextInt();
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
