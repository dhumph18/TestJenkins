package com.base.hello;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyUnitTest {

	@Test
	public void testAdd() {
		int num1 = 3;
		int num2 = 4;
		
		int result = HelloWorld.add(num1, num2);
		
		assertEquals(8, result);
	}
}


