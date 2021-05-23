package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest implements ITestData {

    @Test(description = "Divide two numbers", priority = 2)
    public void divideNumbersTest() {
        Assert.assertEquals(calculator.divide(100, 8), 12.5);
    }

    @Test(dataProvider = "Calculator input", dataProviderClass = ITestData.class,
            description = "Divide two numbers via dataProvider", priority = 1)
    public void divideNumbersViaDataProviderTest(double firstNumber, double secondNumber) {
        Assert.assertEquals(calculator.divide(firstNumber, secondNumber), firstNumber / secondNumber);
    }
}