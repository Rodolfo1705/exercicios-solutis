import java.util.ArrayList;
import java.util.List;

public class Exercicio12 {
    public static void run(){
        Divisor.printExercise(12);

        List<Number> numbersList = divisibleNumbersByThree(1, 100);

        for(int i = 0; i < numbersList.size(); i++){
            double currentNumber = numbersList.get(i).intValue();
            double divisionResultByTwo = currentNumber / 2;
            System.out.println("O resultado da divisão pela metade do número " + currentNumber + " é: " + divisionResultByTwo);
        }
    }

    public static List<Number> divisibleNumbersByThree(int start, int end){
        List<Number> divisibleNumbersList = new ArrayList<>();

        for(int i = start; i <= end; i++) {
            if (i % 3 == 0) divisibleNumbersList.add(i);
        }

        return divisibleNumbersList;
    }
}
