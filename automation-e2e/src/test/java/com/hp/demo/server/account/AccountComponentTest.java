package com.hp.demo.server.account;

import com.hp.demo.support.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = "com.hp.demo.support.RESTTests")
public class AccountComponentTest extends AbstractTest {
    @Test
    public void testSimpleLocation() { }

    @Test
    public void testFoundUseCase() { }

    @Test
    public void testMergeUtils() { }

    @Test
    public void testDelegateListener() { }

    @Test
    public void testSimpleCamera() {
        slowTest();
    }

    @Test
    public void testCreateUseCase() { }

    @Test
    public void testCreateHandler() { }

    @Test
    public void testCreateUtils() {
        Assert.assertTrue(successfulBuild(), "Failed creation of Utils");
    }

    @Test
    public void testDispatchCallback() { }
}
