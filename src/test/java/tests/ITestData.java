package tests;

import org.testng.annotations.DataProvider;

public interface ITestData {

    @DataProvider(name = "Calculator input")
    static Object[][] inputForCalculator() {
        return new Object[][]{
                {5, 6,},
                {-100, 10},
                {234.58, 665.12},
                {-11.4, -235}
        };
    }
}