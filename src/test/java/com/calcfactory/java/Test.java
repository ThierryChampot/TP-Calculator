package com.calcfactory.java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

public class Test {

	private Addition add;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.add = new Addition(1);
	}

	@After
	public void tearDown() throws Exception {
		this.add = null;
	}

	@org.junit.Test
	public void testAddition() {		
		Assert.assertNotNull(this.add);
	}

	@org.junit.Test
	public void testMake() {
		this.add.make(2);
		Assert.assertEquals(3, this.add.value);
	}

	@org.junit.Test
	public void testGetValue() {
		this.add.getValue();
		Assert.assertEquals(1, this.add.getValue());
	}

}
