package com.mk.lang;

import junit.framework.TestCase;

public class AppTest1 extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
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
