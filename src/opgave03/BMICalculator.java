package opgave03;

import java.util.Scanner;

public class BMICalculator {

    static double bmiIndex(double vægt, double hojde){
        return vægt/(hojde*hojde);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv din vægt: ");
        double vægt = scanner.nextDouble();
        System.out.println("skriv din højde i meter: ");
        double hojde = scanner.nextDouble();

        System.out.println(bmiIndex(vægt, hojde));

        scanner.close();
    }
}
