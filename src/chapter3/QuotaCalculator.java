package chapter3;
/*
IF ELSE
Cuando los vendedores tienen mas de 10 ventas reciben un mensaje exitoso
Cuando tienen menos les dicen cuantas les faltaton
 */


import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args){

        int quotes_expected = 10;
        System.out.println("Cuantas ventas tuviste?");
        Scanner scanner = new Scanner(System.in);
        int quotes = scanner.nextInt();
        scanner.close();

        if (quotes >= 10) {
            System.out.println("Felicidades cumpliste tu meta");
        } else {
            System.out.println("Te faltaron " + (quotes_expected - quotes) + " para cumplir tu meta");

        }
    }
}


