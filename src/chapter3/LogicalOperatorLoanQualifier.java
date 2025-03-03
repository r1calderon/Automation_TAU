package chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String[] args) {

        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Cual es tu salario?");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Cuanto tiempo llevas trabajando en tu trabajo actual:");
        double years = scanner.nextDouble();
        scanner.close();

        if (salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.println("Felicidades eres candidato al prestamo");

        } else {
            System.out.println("Lo siento pero tus ingresos deberian superar los $" + requiredSalary + " para pedir el prestamo");
        }
    }
        }



