package chapter4;

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {

        //Obtener el numero de productos
        System.out.println("Cual es el numero de productos a comprar?");
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();

        double total = 0;

        //Crear el loop para sumar el precio de los productos

        for(int i=0; i<cantidad; i++) {
            System.out.println("Ingresa el valor del articulo " + (i+1));
            double precio = scanner.nextDouble();
            total = (total + precio);
        }
        scanner.close();
        System.out.println("El total es de: " + total);
    }

}
