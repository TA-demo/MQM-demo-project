package com.hp.demo.e2e.login;

import com.hp.demo.support.AbstractTest;
import org.testng.annotations.Test;

@Test(groups = { "com.hp.demo.support.FunctionalTests" })
public class LoginFactoryHandlerTest extends AbstractTest {
    @Test
    public void testFoundLocation() { }

    @Test
    public void testCreateContact() { }

    @Test
    public void testMergeImage() { }

    @Test
    public void testFoundCamera() { }

    @Test
    public void testInvalidPerformance() { }

    @Test
    public void testCreateTasks() { }

    @Test
    public void testResetPlatform() { }

    @Test
    public void testExportNotifications() {
        slowTest();
    }

}
