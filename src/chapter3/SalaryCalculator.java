package chapter3;

/*
IF Statement.
All salespeople get a payment of 1000 a week.
Salespeple who exceed 10 sales get an additional bonus of 250
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main (String[] args) {


        //Initialize known values
        double salarioSemana = 1000;
        int bonus;
        System.out.println("Porfavor indica el numero de ventas de esta semana");
        Scanner scanner = new Scanner(System.in);
        int numVentas = scanner.nextInt();
        scanner.close();
        //Get values for the Unknown
        if (numVentas >= 10) {
           bonus = 250;
        }
            else{
                bonus = 0;
            }
            salarioSemana = salarioSemana + bonus;
        System.out.println("El salario de esta semana es " + salarioSemana);
            }

        }
        //Quick detour for the bonus earners





