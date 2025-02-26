package chapter2;

import java.util.Scanner;

public class MadLibsExercise {

    public static void main (String[] args){

        System.out.println("Dame una estacion del anio");
        Scanner scanner = new Scanner(System.in);
        String estacion = scanner.next();
        System.out.println("Ahora dame un numero entero");
        int numero = scanner.nextInt();
        System.out.println("Ahora un adjetivo");
        String adjetivo = scanner.next();

        System.out.println("En una " + adjetivo + " " + estacion + " I drink a minimum of " + numero + " cups of coffe");
    }
}
