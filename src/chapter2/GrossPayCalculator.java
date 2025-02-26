package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

public static void main (String[] args) {

    //1. Get the number of hours worked
    System.out.println("Cuantas horas trabajo?");
    Scanner scanner = new Scanner(System.in);
    int hours = scanner.nextInt();
    //2. Get the houtly pay rate
    System.out.println("A cuanto le pagaron la hora?");
    double rate = scanner.nextDouble();
    //3. Multiply hours and pay rate
    double total = hours * rate;
    //4. Display results
    System.out.println("El total a pagar es" + total);

}
}
