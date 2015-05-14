package com.hp.demo.support;

import java.util.Random;

public class AbstractTest {
    /**
     * It makes the test slower - 10s - 20s
     */
    protected void slowTest() {
        try {
            Thread.sleep(10000 + (randomNumber() * 100));
        } catch (InterruptedException e) {
            //nothing
        }
    }

    /**
     * Returns false when the project is ready to fail.
     * @return false when a random number is higher than or equal 70
     */
    protected boolean successfulBuild() {
        if (randomNumber() >= 70) {
            return false;
        }
        return true;
    }

    /**
     * Random number 0 - 100
     * @return 0 - 100
     */
    protected static int randomNumber() {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println("number " + number);
        return number;
    }
}
