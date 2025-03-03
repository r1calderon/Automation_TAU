package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args) {

        int sumaCash;
        final int dolar = 100;

        System.out.println("how many centavos would you like?");
        Scanner scanner = new Scanner(System.in);
        int centavos = scanner.nextInt();

        System.out.println("how many 5 centavos would you like?");
        int cincosC = scanner.nextInt();

        System.out.println("how many Diez would you like?");
        int diezC = scanner.nextInt();

        System.out.println("how many Veinticincos would you like?");
        int veintiCincoC = scanner.nextInt();

        sumaCash = centavos + (cincosC *5) + (diezC *10) + (veintiCincoC *25);

        if (sumaCash == dolar) {
            System.out.println("Ganaste tu suma es igual a un DOLAR");
        }

       if (sumaCash > dolar) {
            System.out.println("Ups te pasaste por: " + (sumaCash - dolar) + " Centavos");
        }
        if (sumaCash < dolar) {
            System.out.println("Hijole, te faltaron: " + (dolar - sumaCash) + " Centavos");
        }
        }
    }







