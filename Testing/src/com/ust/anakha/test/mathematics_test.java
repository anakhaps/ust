package com.ust.anakha.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class mathematics_test 
{
	mathematics_test aut;
	

	@BeforeEach
	public void setUp() throws Exception 
	{
		System.out.println("Before: setup method is called");
		aut=new mathematics_test();
		aut.setNo1(2);
		aut.setNo2(3);
	}

	@AfterEach
	public void tearDown() throws Exception 
	{
		aut=null;
		System.out.println("this is after");
	}

	@Test
	public void testAdd() 
	{
		int actual=aut.add();
		assertEquals(5,actual);
		
	}

	@Test
	void testSubtract() 
	{
		int actual=aut.subtract();
		assertEquals(-1,actual);
	}

	@Test
	void testProduct()
	{
		int actual=aut.testProduct();
		assertEquals(6,actual);
	}

}
