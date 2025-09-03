import opgave04.TaxCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {
    @Test
    public void NoTax() {
        int actual = TaxCalculator.calculateTax(4000);
        assertEquals(0, actual, "Hvis man ikke tjener mere end personfradraget skal man ikke betale noget i skat");
    }

    @Test
    public void SmallSalary() {
        int actual = TaxCalculator.calculateTax(1000);
        assertEquals(0, actual, "Hvis man ikke bruger hele personfradraget får man ikke skat tilbage");
    }

    @Test
    public void SomeTax() {
        int actual = TaxCalculator.calculateTax(10000);
        assertEquals(26640, actual, "Du skal betale 37% af det du tjener over 4000 kr. om måneden.");
    }

    @Test void HighTax() {
        int actual = TaxCalculator.calculateTax(60000);
        assertEquals(271305, actual, "Du skal betale 37% af det skattepligtige beløb + 15% af det over topskattegrænsen.");
    }
}
