package com.globallogic.mavenprojectone;
import static org.junit.Assert.assertEquals;

import org.junit.Test;




public class Gest {
	


	
		
		   @Test
			public void testing_first() {
				Testingone obj=new Testingone();
					final int numone=6;
				    final int numtwo=7;
				    int expected=13;
				    		
				    assertEquals(expected,obj.add(numone, numtwo));
				    
			}
		   
		@Test
		   public void testing_second() {
			   Testingone obj1=new Testingone();
			   final double rad=314.56;
			   double expected=310851.2;
			    assertEquals(expected,obj1.computeArea(rad),5);
			    System.out.println("FINEFINE");
		   }
			
	}

