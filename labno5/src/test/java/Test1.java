import org.testng.annotations.Test;
import com.lab5.Calculator;
import org.testng.Assert;

public class Test1 {
    // Existing tests...

    @Test
    public void testCalc() {
        Calculator calculator = new Calculator();
        float salary = calculator.getSalary();
        float sales = calculator.getSales();
        
        // sales = 6000 salary = 10000 commsions 120
        double expected = 10120.0; 
        double actual = calculator.calculator(salary,sales);
        Assert.assertEquals(actual, expected, "Calc method failed");
    }
}