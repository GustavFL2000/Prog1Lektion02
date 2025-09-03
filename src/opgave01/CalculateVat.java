package opgave01;

import java.util.Scanner;

public class CalculateVat {

    public static double momsBeregner(double beløb){
        return beløb * 0.25;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv dit beløb før moms: ");
        double beløb = scanner.nextDouble();

        double momsBeløb = momsBeregner(beløb);
        double total = momsBeløb + beløb;

        System.out.println("Her er moms beløbet: " + momsBeløb + " Kr.");
        System.out.println("Her er beløbet med moms inkluderet: " + total + " Kr.");
        scanner.close();
    }
}
