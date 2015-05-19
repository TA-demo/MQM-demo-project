package com.hp.demo.client.image;

import com.hp.demo.support.AbstractTest;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

/**
 * REST
     com.hp.demo.server.image - ImageComponentTest - testExportLifecycle
     com.hp.demo.server.image - ImageComponentTest - testSimpleLifecycle
     com.hp.demo.server.image - ImageComponentTest - testCreateAccount
     com.hp.demo.server.image - ImageComponentTest - testResetHandler
     com.hp.demo.server.image - ImageComponentTest - testResetProviders
     com.hp.demo.server.image - ImageComponentTest - testExportTasks
     com.hp.demo.server.image - ImageComponentTest - testRegistrationUtils
 */
@Test(groups = "com.hp.demo.support.RESTTests")
public class ImageComponentTest extends AbstractTest {
    @Test(enabled = false)
    //disabled test
    public void testExportLifecycle() { }

    @Test
    //Skipped test
    public void testSimpleLifecycle() {
        throw new SkipException("This is occasionally failing. Will be fixed in FF phase.");
    }

    @Test
    public void testCreateAccount() {
        Assert.assertFalse(checkHASetupProperty(), "HA Setup failed");
    }

    @Test
    public void testResetHandler() { }

    @Test
    public void testResetProviders() { }

    @Test
    public void testExportTasks() { }

    @Test
    public void testRegistrationUtils() { }
}
