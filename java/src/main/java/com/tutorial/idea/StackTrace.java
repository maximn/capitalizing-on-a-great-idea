package com.tutorial.idea;

import java.util.Random;

public class StackTrace {
    private Random random = new Random();

    public double entranceMethod() {
        return secondMethod();
    }

    public double secondMethod() {
        return thirdMethod();
    }

    public double thirdMethod() {
        return forthMethod();
    }

    public double forthMethod() {
        double number = random.nextInt(10) / 10d;
        String numericString = String.valueOf(Math.rint(number)); // Expression type (CTRL + SHIFT + P)

        return Integer.parseInt(numericString);
    }
}

// How can we change all methods to return int instead? Remove the `Method` suffix? - Add Selection for next Occurrence (CTRL + G)

// Debugging