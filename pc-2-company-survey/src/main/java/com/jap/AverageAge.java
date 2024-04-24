package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData) {
        double avg = 0;

        try {
            int sum = 0;
            int count = 0;

            // Iterate through the array and calculate the sum of valid ages
            for (String ageStr : ageRawData) {
                try {
                    int age = Integer.parseInt(ageStr);
                    sum += age;
                    count++;
                } catch (NumberFormatException e) {
                    // If a non-numeric value is encountered, catch the exception and return the error message
                    return e.toString();
                }
            }

            // Calculate the average
            avg = (double) sum / count;

        } catch (Exception exception) {
            // Handle unexpected exceptions and return the error message
            return exception.toString();
        }

        // Format the average to two decimal places and return as a string
        return String.format("%.2f", avg);
    }
}
