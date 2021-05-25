package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest extends BaseTest implements ITestData {

    @Test(priority = 2, description = "Add two Numbers")
    public void addNumbersTest() {
        Assert.assertEquals(calculator.add(6, 4), 10);
    }

    @Test(dataProvider = "Calculator input", dataProviderClass = ITestData.class,
            description = "Add two numbers via dataProvider", priority = 1)
    public void addNumbersViaDataProviderTest(double firstNumber, double secondNumber) {
        Assert.assertEquals(calculator.add(firstNumber, secondNumber), firstNumber + secondNumber);
    }
}