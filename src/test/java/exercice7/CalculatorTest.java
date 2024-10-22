package exercice7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int res = calculator.add(1, 2);
        Assertions.assertEquals(3, res);
    }

    @Test
    public void testSubtract() {
        int res = calculator.subtract(1, 2);
        Assertions.assertEquals(-1, res);
    }

    @Test
    public void testMultiply() {
        int res = calculator.multiply(2, 3);
        Assertions.assertEquals(6, res);
    }

    @Test
    public void testDivide() {
        int res = calculator.divide(9, 3);
        Assertions.assertEquals(3, res);
    }

    @Test()
    public void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(2, 0));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 3, 4",
            "17, 3, 20",
            "21, 3, 24",
            "7, -3, 4",
            "5, 3, 8",
            "3, 3, 6",
    })
    public void addParameterizedTest(int a, int b, int expected) {
        int res = calculator.add(a, b);
        Assertions.assertEquals(expected, res);
    }

}
