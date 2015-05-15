package com.hp.demo.support;

import java.util.Random;

public class AbstractTest {
    public static final String BROWSER_PARAM = "Browser";
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
        return randomNumber() < 70;
    }



    protected boolean failOnIE() {
        return failingBuildEnvParamBased(BROWSER_PARAM, "IE");
    }

    protected boolean failOnFireFox() {
        return failingBuildEnvParamBased(BROWSER_PARAM, "FireFox");
    }

    protected boolean failingBuildEnvParamBased(String propertyName, String value) {
        if (propertyName == null || value == null) {
            return false;
        }
        String propertyValue = System.getProperty(propertyName);
        return propertyValue != null && value.toLowerCase().equals(propertyValue.toLowerCase());
    }

    /**
     * Random number 0 - 100
     * @return 0 - 100
     */
    protected static int randomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}
