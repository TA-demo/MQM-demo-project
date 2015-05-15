package com.hp.demo.e2e.lifecycle;

import com.hp.demo.support.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Functional
     com.hp.demo.e2e.lifecycle - LifecycleHandlerTest - testDispatchEvent
     com.hp.demo.e2e.lifecycle - LifecycleHandlerTest - testExportPerformance
     com.hp.demo.e2e.lifecycle - LifecycleHandlerTest - testNotFoundNegative
     com.hp.demo.e2e.lifecycle - LifecycleHandlerTest - testNotFoundLocation
     com.hp.demo.e2e.lifecycle - LifecycleHandlerTest - testExportValidation
 */
@Test(groups = { "com.hp.demo.support.FunctionalTests" })
public class LifecycleHandlerTest extends AbstractTest {
    @Test
    public void testDispatchEvent() {
        Assert.assertFalse(failOnIE(), "An error occurred during event processing on IE");
        Assert.assertFalse(failOnFireFox(), "An error occurred during event processing on FireFox");
    }

    @Test
    public void testExportPerformance() {
    }

    @Test
    public void testNotFoundNegative() {
        Assert.assertFalse(failOnIE(), "Entity was not found on IE");
    }

    @Test
    public void testNotFoundLocation() {
        Assert.assertFalse(failOnIE(), "Location was not found on IE");
    }

    @Test
    public void testExportValidation() {
        Assert.assertFalse(failOnIE(), "Validation failed on IE");
    }
}
