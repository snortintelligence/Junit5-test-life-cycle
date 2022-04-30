package com.snort.intelli;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



/**
 * @author Siddhartha Sharma
 * @life cycle : Who instantiate the CalculatorTest class - 
 *               JUnit manages the life cycle of this class.
 *               It gives you an opportunity to execute code at certain point in that life cycle from
 *               the creation of the class all the way to its termination. 
 *               so we r going to be examining that there. in Junit4 | Junit5 new way to do the same thing.
 *               Junit creates a new instance for the method.  
 */
class CalculatorTest {

	

	@Test
	void testSubtract() {
		Calculator calculator = new Calculator();
		int actual = calculator.subtract(12, 3);
		int expected = 9;
		assertEquals(expected, actual);// verify the result what you expect
	}

	@Test
	void testSum() {
		Calculator calculator = new Calculator();
		int actual = calculator.sum(12, 3);
		int expected = 15;
		assertEquals(expected, actual);
	}

	@Test
	void testMultiply() {
		Calculator calculator = new Calculator();
		int actual = calculator.multiply(12, 3);
		int expected = 36;
		assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		Calculator calculator = new Calculator();
		int actual = calculator.divide(12, 3);
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	void testReminder() {
		Calculator calculator = new Calculator();
		int actual = calculator.reminder(14, 3);
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSubtractWhenGivenNumbersNegetive() {
		Calculator calculator = new Calculator();
		int actual = calculator.subtract(-12, -3);
		int expected = 9;
		assertEquals(expected, actual , "The both numbers should be valid!");// verify the result what you expect
	}
}
