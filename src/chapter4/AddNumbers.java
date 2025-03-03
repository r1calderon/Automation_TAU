package chapter4;

/*
DO WHILE LOOP
Escribe un programa que permita a los usuarios ingresar 2 numeros
y sumarlos, el usuario debe ser capaz de repetir el mismo
procedimiento hasya que indique que es sufuciente
 */

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        boolean respuesta;

        do {

            System.out.println("Favor de ingresar el primer numero");
            Scanner scanner = new Scanner(System.in);
            double primero = scanner.nextDouble();

            System.out.println("Favor de ingresar el segundo numero");
            double segundo = scanner.nextDouble();

            double suma = primero + segundo;

            System.out.println("La suma es: " + suma);

            System.out.println("Deseas hacer otra operacion?");
            respuesta = scanner.nextBoolean();
            scanner.close();

        }

        while (respuesta);

        }
    }




