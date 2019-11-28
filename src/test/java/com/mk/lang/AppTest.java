package com.mk.lang;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
    	App t = new App( "12345", "ABCDF", 6, 4 );
    	assertEquals("No the same num is on the array",t.getString(t));
    	//assertEquals(true,t.isSort(t.intArray1));
    	//assertEquals(true,t.isSort(t.intArray2));
    }
    public void testApp2()
    {
    	App t = new App( "abcd", "12345", 8, 4 );
    	assertEquals("str2 isNumeric",t.getString(t));
    	assertEquals(true,t.isSort(t.intArray1));
    	//assertEquals(true,t.isSort(t.intArray2));
    }
    public void testApp3()
    {
    	App t = new App( "1232131", "12345", 8, 4 );
    	assertEquals("Both str isNumeric",t.getString(t));
    	assertEquals(true,t.isSort(t.intArray1));
    	//assertEquals(true,t.isSort(t.intArray2));
    }
}