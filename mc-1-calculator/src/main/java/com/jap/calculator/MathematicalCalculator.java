package com.jap.calculator;

public class MathematicalCalculator {

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int divide(int num1, int num2) {
		if (num2 == 0) {
			// Return 0 to indicate division by zero
			return 0;
		}
		return num1 / num2;
	}

	public int modulo(int num1, int num2) {
		return num1 % num2;
	}
}
