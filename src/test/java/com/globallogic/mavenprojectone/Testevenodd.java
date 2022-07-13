package com.globallogic.mavenprojectone;
import static org.junit.Assert.assertEquals;


import static org.junit.jupiter.api.Assertions.*; 
import java.lang.*;
import org.junit.Test;

public class Testevenodd {
	@Test
     public void checkTDD() {
    	 EvenOdd obj=new EvenOdd();
    	 final int num=4;
    	 int expected=1;
    	 assertEquals(expected,obj.checkevenodd(num));
    	
     }
	@Test
	public void testexcept() {
		final EvenOdd obj1=new EvenOdd();
		assertThrows(ArithmeticException.class,()->obj1.divide(10,0));
	}
	
	

	

	

	
}
