package opgave04;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast månedlig indkomst: ");
        int income = scanner.nextInt();
        int tax = calculateTax(income);
        System.out.println("Årlig skat er " + tax + " kr.");
    }

    public static int calculateTax(int monthlyIncome) {
        // Konstantværdier
        final int BASE_DEDUCTION = 48_000;   // årligt personfradrag
        final int TOP_TAX_LIMIT = 568_900;   // topskattegrænse
        final double NORMAL_TAX_RATE = 0.37; // 37% skat
        final double TOP_TAX_RATE = 0.15;    // 15% topskat

        // Beregn årsløn
        int yearlyIncome = monthlyIncome * 12;

        // Beregn skattepligtig indkomst (årsløn - fradrag)
        int taxableIncome = yearlyIncome - BASE_DEDUCTION;

        if (taxableIncome <= 0) {
            return 0; // Ingen skat hvis under fradrag
        }

        // Normal skat
        double yearlyTax = taxableIncome * NORMAL_TAX_RATE;

        // Topskat
        if (yearlyIncome > TOP_TAX_LIMIT) {
            int topTaxIncome = yearlyIncome - TOP_TAX_LIMIT;
            yearlyTax += topTaxIncome * TOP_TAX_RATE;
        }

        // Returnér årlig skat (afrundet til nærmeste kr.)
        return (int) Math.round(yearlyTax);
    }
}
