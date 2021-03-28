package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.BranchingPrograms;

import java.util.Scanner;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
 * он прямоугольным
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first angle: ");
        double firstAngle = scanner.nextDouble();
        System.out.print("Enter second angle: ");
        double secondAngle = scanner.nextDouble();
        scanner.close();

        if ((firstAngle + secondAngle) < 180) {
            System.out.println("Triangle exists.");
            if ((firstAngle + secondAngle) == 90) {
                System.out.println("Triangle rectangular.");
            }
        } else {
            System.out.println("Triangle not exists.");
        }
    }
}
