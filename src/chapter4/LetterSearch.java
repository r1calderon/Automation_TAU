package chapter4;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {

        //Obtener la palabra
        System.out.println("Cual es la palabra que quieres escanear?");
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.next();
        scanner.close();

        boolean letrEencontrada = false;

        //Crear el loop para sumar el precio de los productos

        for(int i=0; i<palabra.length(); i++) {
            char letraActual = palabra.charAt(i);
            if (letraActual == 'A' || letraActual == 'a') {
                letrEencontrada = true;
                break;
            }

        }
        if (letrEencontrada) {
            System.out.println("Tu palabra SI contiene la letra A");
        }
                else{
                System.out.println("Tu palabra NO contiene la letra A");
            }
            }
        }



