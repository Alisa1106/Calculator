package tests;

import Apps.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    Calculator calculator;

    @BeforeMethod
    public void initTest() {
        calculator = new Calculator();
        System.out.println("START NEW TEST!");
    }

    @AfterMethod(alwaysRun = true)
    public void endTest() {
        System.out.println("FINISH TEST");
    }
}