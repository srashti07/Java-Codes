package com.jap;

public class QuizDemo {

    // Return the school name which has got the highest score in quiz
    // Handle the NumberFormatException
    public String highestScore(String[] nameOfSchool, String[] scores) {
        if (nameOfSchool == null || scores == null || nameOfSchool.length != scores.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        int maxScore = Integer.MIN_VALUE;
        String schoolWithMaxScore = "";

        try {
            for (int i = 0; i < scores.length; i++) {
                int score = Integer.parseInt(scores[i]);
                if (score > maxScore) {
                    maxScore = score;
                    schoolWithMaxScore = nameOfSchool[i];
                }
            }
        } catch (NumberFormatException e) {
            return e.toString();
        }

        return schoolWithMaxScore;
    }

    // Convert all the names to uppercase
    // Handle the NullPointerException
    public String[] convertAllNamesToCapital(String[] names) {
        if (names == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        String[] upperCaseNames = new String[names.length];

        try {
            for (int i = 0; i < names.length; i++) {
                upperCaseNames[i] = names[i].toUpperCase();
            }
        } catch (NullPointerException e) {
            return new String[]{e.toString()};
        }

        return upperCaseNames;
    }
}
