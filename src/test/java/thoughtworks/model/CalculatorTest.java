package thoughtworks.model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void shouldCalculate() {
        Calculator calculator = new Calculator();
        calculator.setFirstNumber(1);
        calculator.setSecondNumber(2);
        int result = calculator.calculate();
        assertThat(result,is(3));
    }
}