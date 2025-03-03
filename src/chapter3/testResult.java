package chapter3;

import java.util.Scanner;

public class testResult {

    public static void main(String[] args) {

        //Get the test score
        System.out.println("Favor de indicar la calificacion");
        Scanner scanner = new Scanner(System.in);
        double calificacion = scanner.nextDouble();

        //Determine the letter
        char nota;
        if (calificacion < 60) {
            nota = 'F';
        } else if (calificacion < 70) {
            nota = 'D';
        } else if (calificacion < 80) {
            nota = 'C';
        } else if (calificacion < 90) {
            nota = 'B';
        } else {
            nota = 'A';
        }
        System.out.println("Tu calificacion es:"+nota);
    }
}

