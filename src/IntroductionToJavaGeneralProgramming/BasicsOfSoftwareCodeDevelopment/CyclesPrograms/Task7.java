package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.CyclesPrograms;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;

        while (true) {
            System.out.println("Enter [m, n] (m,n > 0): ");
            m = scanner.nextInt();
            n = scanner.nextInt();
            if (m > 0 && n > 0 && m < n) {
                scanner.close();
                break;
            }
        }

        for (int i = m; i <= n; i++) {
            System.out.print("Divider number of " + i + ": ");
            dividersNumber(i);
        }

    }

    public static void dividersNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
