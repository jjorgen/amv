package org.nsu.dcis.amv.controller;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AmvClientTest extends TestCase
{
    public AmvClientTest(String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AmvClientTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
}
