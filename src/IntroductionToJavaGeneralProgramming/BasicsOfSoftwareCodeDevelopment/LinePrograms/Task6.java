package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.LinePrograms;

import java.util.Scanner;

/**
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coordinate x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter coordinate y: ");
        double y = scanner.nextDouble();
        scanner.close();

        System.out.println(area(x, y));
    }

    public static boolean area(double x, double y) {
        return (((x <= 2 && x >= -2) && (y <= 4 && y >= 0)) &&
                ((x <= 4 && x >= -4) && (y <= 0 && y >= -3)));
    }
}
