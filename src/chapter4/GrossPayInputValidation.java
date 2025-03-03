package chapter4;

//WHILE LOOP
// Cada empleado cobra 15 por hora, escribe un programa que le permita a los
//empleados ingresar el numero de horas trabajadas en la semana. No overtime

import java.util.Scanner;

public class GrossPayInputValidation  {
    public static void main(String[] args) {

        int rate = 15;
        int maxHours = 40;

        System.out.println("Cuantas horas trbajaste esta semana?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours || hoursWorked <1){
            System.out.println("Respuesta equivocada, debe ser entre 1-40");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double salary = rate * hoursWorked;
        System.out.println("Tu pago sera de: " + salary);
    }
}
