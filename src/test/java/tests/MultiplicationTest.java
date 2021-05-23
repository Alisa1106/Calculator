package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTest extends BaseTest implements ITestData {

    @Test(description = "Multiply two numbers", priority = 2)
    public void multiplyNumbersTest() {
        Assert.assertEquals(calculator.multiply(150, 400), 60_000);
    }

    @Test(dataProvider = "Calculator input", dataProviderClass = ITestData.class,
            description = "Multiply two numbers via dataProvider", priority = 1)
    public void multiplyNumbersViaDataProviderTest(double firstNumber, double secondNumber) {
        Assert.assertEquals(calculator.multiply(firstNumber, secondNumber), firstNumber * secondNumber);
    }
}