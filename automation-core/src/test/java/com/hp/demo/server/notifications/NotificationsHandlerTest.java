package com.hp.demo.server.notifications;

import com.hp.demo.support.AbstractTest;
import com.hp.demo.support.UnitTests;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(UnitTests.class)
public class NotificationsHandlerTest extends AbstractTest {

    @Test
    public void testSimpleModule() { }

    @Test
    public void testCreateAccount() { }

    @Test
    public void testInvalidImage() { }

    @Test
    public void testExportSearch() { }

    @Test
    public void testDelegateHandler() { }

    @Test
    public void testRegistrationHandler() {
        Assert.assertTrue("Handler registration failed.", successfulBuild());
    }

    @Test
    public void testMergeCallback() {
        slowTest();
    }

    @Test
    public void testNullCamera() { }
}
