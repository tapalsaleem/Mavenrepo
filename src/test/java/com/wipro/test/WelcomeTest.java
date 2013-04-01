package com.wipro.test;

import org.junit.Test;

import com.wipro.src.Welcome;

import junit.framework.TestCase;




public class WelcomeTest extends TestCase{
	
	@Test
	public void  testsimpleMethod(){
		
		Welcome wel = new Welcome();
		assertEquals("wipro", wel.simpleMethod());
		
		
	}

}
