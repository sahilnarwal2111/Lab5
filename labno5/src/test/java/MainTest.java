import org.testng.annotations.Test;
import com.lab5.Calculator;
import org.testng.Assert;

public class MainTest {
    @Test
    public void Test1(){
        Calculator obj=new Calculator();
        obj.setNumberOfCalls(100);
        int numberOfCalls = obj.getNumberOfCall();
        double result = obj.calculateBill(numberOfCalls);
        Assert.assertEquals(result, 500.0, "Calc method Failed...");
    }
    
    @Test
    public void Test2(){
        Calculator obj=new Calculator();
        obj.setNumberOfCalls(301);
        int numberOfCalls = obj.getNumberOfCall();
        double result = obj.calculateBill(numberOfCalls);
        Assert.assertEquals(result, 500.95, "Calc method Failed...");
    }
    
    @Test
    public void Test3(){
        Calculator obj=new Calculator();
        obj.setNumberOfCalls(399);
        int numberOfCalls = obj.getNumberOfCall();
        double result = obj.calculateBill(numberOfCalls);
        Assert.assertEquals(result, 612.75, "Calc method Failed...");
    }
    
    @Test
    public void Test4(){
        Calculator obj=new Calculator();
        obj.setNumberOfCalls(455);
        int numberOfCalls = obj.getNumberOfCall();
        double result = obj.calculateBill(numberOfCalls);
        Assert.assertEquals(result, 696.75, "Calc method Failed...");
    }
    
    @Test
    public void Test5(){
        Calculator obj=new Calculator();
        obj.setNumberOfCalls(500);
        int numberOfCalls = obj.getNumberOfCall();
        double result = obj.calculateBill(numberOfCalls);
        Assert.assertEquals(result, 798.0, "Calc method Failed...");
    }
}