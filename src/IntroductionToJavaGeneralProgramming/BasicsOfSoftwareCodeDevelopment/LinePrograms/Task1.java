package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.LinePrograms;

import java.util.Scanner;

/**
 * Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a = ");
        double a = scanner.nextDouble();
        System.out.print("Enter b = ");
        double b = scanner.nextDouble();
        System.out.print("Enter c = ");
        double c = scanner.nextDouble();
        scanner.close();

        System.out.println("z = " + (((a - 3) * b / 2) + c));
    }
}
