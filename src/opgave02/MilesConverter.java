package opgave02;

import java.util.Formatter;
import java.util.Scanner;

public class MilesConverter {

static double convert(double miles){

        return miles * 1.6;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv et antal mil, for at convertere til km: ");
        double x = scanner.nextInt();
        scanner.close();

        double y = convert(x);


        System.out.println("Antal km: " + y);
    }
}   
