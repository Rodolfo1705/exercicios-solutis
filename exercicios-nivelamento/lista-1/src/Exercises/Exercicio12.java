package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio12 {
    public static void run(){
        Divisor.printExercise(12);

        int totalMileage = 0;
        int totalLiters = 0;
        int fuelTanksQuantity = 0;

        while (true) {
            int mileage = InputHandler.getIntInput("Digite a quilometragem dirigida (ou -1 para encerrar): ");

            if (mileage == -1) break;

            int inputedLiters = InputHandler.getIntInput("Digite a quantidade de litros de gasolina consumidos: ");
            totalLiters += inputedLiters;

            double consumptionPerLiter = (double) mileage / inputedLiters;

            totalMileage += mileage;
            fuelTanksQuantity++;

            System.out.println("Consumo no tanque " + fuelTanksQuantity + ": " + consumptionPerLiter +" km/L");
        }
        double consumptionAverage = (double) totalMileage / totalLiters;

        System.out.println("=======================================================");
        System.out.println("Quilometragem combinada: " + totalMileage + " km");
        System.out.println("Consumo total de combustível: " + totalLiters + "/L");
        System.out.printf("Média de consumo geral: %.2f km/l%n", consumptionAverage);

    }
}
