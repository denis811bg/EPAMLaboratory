package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.BranchingPrograms;

import java.util.Scanner;

/**
 * Найти max{min(a, b), min(c, d)}
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        System.out.print("Enter d: ");
        double d = scanner.nextDouble();
        scanner.close();

        // First release
        if (a < b) {
            if (c < d) {
                System.out.println(a < c ? c : a);
            } else {
                System.out.println(a < d ? d : a);
            }
        } else {
            if (c < d) {
                System.out.println(b < c ? c : b);
            } else {
                System.out.println(b < d ? d : b);
            }
        }

        // Second release
        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
    }
}
