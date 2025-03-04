package chapter5;

/*
Primer metodo
Escribe un metodo que pregunte al usuario su nombre, entonces agradecerle usando su nombre.
 */

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {

        System.out.println("Ingresa tu nombre:");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        regresaNombre(nombre);

        }

        public static void regresaNombre(String nombre) {
            System.out.println("Hola " + nombre);
        }
        }




