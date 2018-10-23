package com.tutorial.idea;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Debugging {
    private Random random = new Random();
    private ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    private boolean specialCase = false;

    public void start() {
        while (!specialCase) {
            oftenCalled();

            if (random.nextInt(100) > 90) {
                specialCase = true;
                oftenCalledAsync();
            }
        }
    }

    private void oftenCalledAsync() {
        executorService.submit(this::oftenCalled);
    }

    private void oftenCalled() {
        System.out.println("This is called very often!");
    }
}

// 0. Naive solution
// 1. conditional
// 2. put another breakpoint to serve as a condition


// Bad