package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    //Que informacion sabemos?
    static double overageCost = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double baseCostPlan = getBaseCostPlan();
        double overageMinutes = getoverageMinutes();
        getBillStatement(baseCostPlan, overageMinutes);

        scanner.close();

    }

    public static double getBaseCostPlan() {
        System.out.println("Enter base cost of the plan:");
        double baseCostPlan = scanner.nextDouble();
        return baseCostPlan;
    }

    public static double getoverageMinutes() {
        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();
        return overageMinutes * overageCost;
    }

    public static void getBillStatement(double baseCostPlan, double overageMinutes) {
        double taxTotal = (baseCostPlan + overageMinutes) * tax;
        double total = (taxTotal + baseCostPlan + overageMinutes);
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + baseCostPlan);
        System.out.println("Overage: $" + overageMinutes);
        System.out.println("Tax: $" + taxTotal);
        System.out.println("Total: $" + total);

    }
}


