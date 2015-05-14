package com.hp.demo.support;

import java.util.Random;

public class AbstractTest {

    /**
     * It makes the test slower - 10s - 20s
     */
    protected static void slowTest() {
        try {
            Thread.sleep(10000 + (randomNumber() * 100));
        } catch (InterruptedException e) {
            //nothing
        }
    }

    public static void main(String[] args) {
        for (int i = 0 ; i < 10; i++) {
            slowTest();
        }
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
