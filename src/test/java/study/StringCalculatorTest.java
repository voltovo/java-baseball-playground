package study;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	StringCalculator stringCalculator;

	@BeforeEach
	public void setup() {
		stringCalculator = new StringCalculator();
	}

	@Test
	public void testFourFundamentalArithmeticOperations() {

		SoftAssertions softAssert = new SoftAssertions();

		softAssert.assertThat(8).isEqualTo(stringCalculator.add(4, 4));
		softAssert.assertThat(6).isEqualTo(stringCalculator.subtract(7, 1));
		softAssert.assertThat(4).isEqualTo(stringCalculator.multiply(2, 2));
		softAssert.assertThat(2).isEqualTo(stringCalculator.divide(4, 2));
		softAssert.assertThat(4).isEqualTo(stringCalculator.calculator(2, 'x', 2));
		softAssert.assertAll();
	}

	@Test
	public void testDivideZero() {
		assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> {
			stringCalculator.divide(3, 0);
		}).withMessageMatching("/ by zero");
	}

	@Test
	public void testIsBlankError() {
		assertThatExceptionOfType(RuntimeException.class).isThrownBy(() -> {
			stringCalculator.calculatorResult(" ");
		}).withMessageMatching("Index 0 out of bounds for length 0");
	}

	@Test
	public void testCalculator() {
		assertThat(6).isEqualTo(stringCalculator.calculatorResult("1 + 2 * 4 / 2"));
	}
}
