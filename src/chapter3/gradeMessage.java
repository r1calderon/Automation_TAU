package chapter3;

import java.util.Scanner;

public class gradeMessage {

    public static void main(String[] args) {

        System.out.println("Que calificacion obtuviste?");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message = switch (grade) {
            case "A" -> "Excellent";
            case "B" -> "Great";
            case "C" -> "Good";
            case "D" -> "Apenitas";
            case "F" -> "Valio cake";
            default -> "Grade not valid";
        };

        System.out.println(message);
        }

}
