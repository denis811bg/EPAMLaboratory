package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.LinePrograms;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
 * дробную и целую части числа и вывести полученное значение числа
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number R in format nnn.ddd: ");
        double R = scanner.nextDouble();
        scanner.close();

        System.out.println("Result = " + new DecimalFormat("000.000").format(R * 1000 % 1000 + (int) R / 1000.0));
    }
}
