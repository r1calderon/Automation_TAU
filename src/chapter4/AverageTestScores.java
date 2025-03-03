package chapter4;

/*
NESTED LOOPS
Encontrar el promedio para cada estudiante
 */

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {

        int numeroDeEstudiantes = 3;
        int numeroDePruebas = 4;
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i< numeroDeEstudiantes; i++){
            double total = 0;
            for(int j=0; j<numeroDePruebas; j++){
                System.out.println("Ingresa la calificacion para la prueba #" + (j+1));
                double calificacion = scanner.nextDouble();
                total = total + calificacion;

            }
            double promedio = total/numeroDePruebas;
            System.out.println("El promedio de prueba para el estudiante #" + (i+1) + " is " + promedio );
        }
        scanner.close();
    }

}
