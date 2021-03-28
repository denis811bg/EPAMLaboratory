package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.CyclesPrograms;

/**
 * Найти сумму квадратов первых ста чисел.
 */
public class Task3 {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i <= 100; i++) {
            result += i * i;
        }

        System.out.println("Result: " + result);
    }
}
