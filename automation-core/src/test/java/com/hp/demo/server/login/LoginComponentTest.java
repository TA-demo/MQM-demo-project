package com.hp.demo.server.login;

import com.hp.demo.support.AbstractTest;
import com.hp.demo.support.SystemTests;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(SystemTests.class)
public class LoginComponentTest extends AbstractTest {
    @Test
    //slow test
    public void testDispatchCamera() {
        slowTest();
    }

    @Test
    public void testNullModule() { }

    @Test
    public void testResetNegative() { }

    @Test
    public void testFoundContact() { }


    @Test
    public void testNullPerformance() { }

    @Test
    public void testFoundListener() {
        Assert.assertTrue("Listener was not found.", successfulBuild());
    }

    @Test
    public void testRegistrationCallback() { }

    @Test
    public void testFoundPlatform() { }

}
