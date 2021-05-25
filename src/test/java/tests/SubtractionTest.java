package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTest extends BaseTest implements ITestData {

    @Test(description = "Subtract two numbers", priority = 2)
    public void subtractNumbersTest() {
        Assert.assertEquals(calculator.subtract(20, 4), 16);
    }

    @Test(dataProvider = "Calculator input", dataProviderClass = ITestData.class,
            description = "Subtract two numbers via dataProvider", priority = 1)
    public void subtractNumbersViaDataProviderTest(double firstNumber, double secondNumber) {
        Assert.assertEquals(calculator.subtract(firstNumber, secondNumber), firstNumber - secondNumber);
    }
}