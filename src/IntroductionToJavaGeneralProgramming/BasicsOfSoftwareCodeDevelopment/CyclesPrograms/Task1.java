package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.CyclesPrograms;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        int result = 0;

        while (true) {
            System.out.print("Enter N (N > 0): ");
            N = scanner.nextInt();
            if (N > 0) {
                scanner.close();
                break;
            }
        }

        for (int i = 1; i <= N; i++) {
            result += i;
        }

        System.out.println("Result: " + result);
    }
}
