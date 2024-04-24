package com.jap.calculator;

public class ScientificCalculator {

	public double cielOfANumber(float num) throws CalculatorException {
		if (num <= 0) {
			throw new CalculatorException("Number should be greater than 0 for ceil operation");
		}
		return Math.ceil(num);
	}

	public double floorOfANumber(float num) throws CalculatorException {
		if (num <= 0) {
			throw new CalculatorException("Number should be greater than 0 for floor operation");
		}
		return Math.floor(num);
	}

	public long power(int num1, int num2) throws CalculatorException {
		if (num1 < 0 || num2 < 0) {
			throw new CalculatorException("Both base and exponent must be non-negative");
		}
		return (long) Math.pow(num1, num2);
	}

	public double squareRoot(int num) throws CalculatorException {
		if (num < 0) {
			throw new CalculatorException("Number should be non-negative for square root operation");
		}
		return Math.sqrt(num);
	}

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			System.out.println(scientificCalculator.cielOfANumber(10));
			System.out.println(scientificCalculator.floorOfANumber(10));
			System.out.println(scientificCalculator.power(2, 3));
			System.out.println(scientificCalculator.squareRoot(25));
		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
	}
}
