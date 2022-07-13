package com.globallogic.mavenprojectone;
import static org.junit.jupiter.api.Assertions.*;


import java.io.Console;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
public class Lifecycletest {
	
	
	//Wrapper object
	Lifecycle obj=new Lifecycle();
	
	@BeforeAll
	public static void beforeclass() {
		System.out.println("THIS IS BEFORE All");
	}
	
	@BeforeEach
	public void thisisbeforeeach() {
		System.out.println("Before each method--------------------");
	}
	
	
	@RepeatedTest(2)
	public void displaypower() {
	    final int number=5;
	    int expected=25;
	    assertEquals(expected,obj.findsquare(5));
	    System.out.println("This is a test method");
	}
	
	@AfterEach
	public void thisisaftereach() {
		System.out.println("After each method####################");
	}
	@AfterAll
	public static void afterclass() {
		System.out.println("THIS IS AFTER ALL");
	}
	
	
	
	

}
