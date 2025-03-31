package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


import static org.example.Main.*;

public class MainTest {
    @DataProvider(name = "gFunctionProvider")
    public static Object[][] gFunctionProvider() {
        return new Object[][]{
                // ARRANGE - подготовка тестовых данных
                {7.00, Double.NaN},
                {-5.00, Double.NaN}
        };
    }

    @Test(groups = "group1", dataProvider = "gFunctionProvider")
    public static void test_g(double input, double expectedResult) {
        System.out.println("Функция g:");

        // ACT - выполнение тестируемого метода
        double actualResult = g(input);

        // ASSERT - проверка ожидаемого результата
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "group1")
    public static void test_si() {
        System.out.println("Функция si:");
        // ARRANGE
        final int NUMBER1 = 2;
        final double NUMBER2 = 3.34;
        final double EXPECTEDRUSULT = 5.5778;
        double actualResult;
        // ACT
        actualResult = si(NUMBER1, NUMBER2);
        // ASSERT
        Assert.assertEquals(actualResult, EXPECTEDRUSULT);
    }

    @Test(groups = "group1")
    public static void test_si1() {
        System.out.println("Функция si:");
        // ARRANGE
        final int NUMBER1 = 0;
        final double NUMBER2 = 3.54;
        final double EXPECTEDRUSULT = 1;
        double actualResult;
        // ACT
        actualResult = si(NUMBER1, NUMBER2);
        // ASSERT
        Assert.assertEquals(actualResult, EXPECTEDRUSULT);
    }
    //ARRANGE для test_isHappy
    @DataProvider(name = "happyNumbersProvider")
    public static Object[][] happyNumbersProvider() {   //false – это boolean, и его нельзя хранить в Integer[][], поэтому Object[][] здесь необходим.
        return new Object[][]{
                {123321, true},
                {1002000, false},
                {-1002000, false}
        };
    }

    @Test(groups = {"group1", "group2"}, dataProvider = "happyNumbersProvider")
    public static void test_isHappy(int number1, boolean expectedResult) {
        System.out.println("Функция isHappy:");
        // ARRANGE
        boolean actualResult;
        // ACT
        actualResult = isHappy(number1);
        // ASSERT
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test(groups = "group2")
    public static void test_numberInBinaryNumeralSystem() {
        System.out.println("Функция numberInBinaryNumeralSystem:");
        // ARRANGE
        final int NUMBER1 = 2;
        final int EXPECTEDRUSULT = 10;
        int actualResult;
        // ACT
        actualResult = numberInBinaryNumeralSystem(NUMBER1);
        // ASSERT
        Assert.assertEquals(actualResult, EXPECTEDRUSULT);
    }

    @Test(groups = "group2")
    public static void test_numberInBinaryNumeralSystem1() {
        System.out.println("Функция numberInBinaryNumeralSystem:");
        // ARRANGE
        final int NUMBER1 = 5;
        final int EXPECTEDRUSULT = 101;
        int actualResult;
        // ACT
        actualResult = numberInBinaryNumeralSystem(NUMBER1);
        // ASSERT
        Assert.assertEquals(actualResult, EXPECTEDRUSULT);
    }

    @Test(groups = "group2")
    public static void test_numberInNewNumeralSystem() {
        System.out.println("Функция numberInNewNumeralSystem:");
        // ARRANGE
        final int NUMBER1 = 10;
        final int NUMBER2 = 4;
        final int EXPECTED_RESULT = 22;
        int actualResult;
        // ACT
        actualResult = numberInNewNumeralSystem(NUMBER1, NUMBER2);
        // ASSERT
        Assert.assertEquals(actualResult, EXPECTED_RESULT);
    }

    @Test(groups = "group2")
    public static void test_numberInNewNumeralSystem1() {
        System.out.println("Функция numberInNewNumeralSystem:");
        // ARRANGE
        final int NUMBER1 = 17;
        final int NUMBER2 = 8;
        final int EXPECTEDRUSULT = 21;
        int actualResult;
        // ACT
        actualResult = numberInNewNumeralSystem(NUMBER1, NUMBER2);
        // ASSERT
        Assert.assertEquals(actualResult, EXPECTEDRUSULT);
    }
}



