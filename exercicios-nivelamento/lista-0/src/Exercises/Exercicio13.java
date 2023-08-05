package Exercises;

import Utils.Divisor;

import java.util.ArrayList;
import java.util.List;

public class Exercicio13 {
    public static void run() {
        Divisor.printExercise(13);

        System.out.println("As combinações possíveis resultantes em 7 são: ");
        System.out.println(getDiceSumPossibilities());
    }

    private static List<List<Number>> getDiceSumPossibilities() {
        List<Number> firstDiceValues = populateDiceList();
        List<Number> secondDiceValues = populateDiceList();

        List<List<Number>> possibilitiesOfSum = new ArrayList<>();

        for (int i = 0; i < firstDiceValues.size(); i++) {
            for (int j = 0; j < secondDiceValues.size(); j++) {
                if (firstDiceValues.get(i).intValue() + secondDiceValues.get(j).intValue() != 7)
                    continue;

                List<Number> combination = new ArrayList<>();
                combination.add(firstDiceValues.get(i));
                combination.add(secondDiceValues.get(j));

                possibilitiesOfSum.add(combination);
            }
        }
        return possibilitiesOfSum;
    }

    private static List<Number> populateDiceList() {
        List<Number> diceValuesList = new ArrayList<>();
        diceValuesList.add(1);
        diceValuesList.add(2);
        diceValuesList.add(3);
        diceValuesList.add(4);
        diceValuesList.add(5);
        diceValuesList.add(6);

        return diceValuesList;
    }
}
