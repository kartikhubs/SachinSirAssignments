package Self;

import java.util.*;


import java.lang.*;

import java.io.*;
class Student implements Comparable<Student>{
	int age,roll;
	String name;
	public Student(int age,int roll,String name){
		this.age=age;
		this.roll=roll;
		this.name=name;
	}
	
	public int compareTo(Student st) {
		if(roll==st.roll) {
			return 0;
		}
		else if(roll>st.roll) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	
}

public class Comparing{
	public static void main(String args[]) {
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student(21,74,"KARTIK"));
		al.add(new Student(21,107,"JIGYASA"));
		al.add(new Student(21,74,"MAYANK"));
		
		al.add(new Student(21,89,"NAMRATA"));
		al.add(new Student(21,74,"NAMAN"));
		
		Collections.sort(al);
		for(Student obj:al) {
			System.out.println(obj.age+" "+obj.roll+" "+obj.name);
		}
		
	}
}

