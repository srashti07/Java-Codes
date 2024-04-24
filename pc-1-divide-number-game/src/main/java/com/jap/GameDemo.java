package com.jap;

public class GameDemo {

    public String divideByNumber(int firstNumber, int secondNumber){
        // create local variable
        int finalNumber = 0;
        try {
            // write logic
            if (secondNumber != 0) {
                finalNumber = firstNumber / secondNumber;
            } else {
                // If the second number is zero, throw an ArithmeticException
                throw new ArithmeticException("/ by zero");
            }
        } catch (ArithmeticException exception) {
            // Handle specific exception
            return exception.toString();
        }
        return String.valueOf(finalNumber);
    }
}
