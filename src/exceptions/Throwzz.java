package exceptions;

public class Throwzz{
  static void eligible(int age) {
	  try {
		  if(age<12) {
			  throw new ArithmeticException("INVALID");
		  }
		  else {
	              System.out.println("VALID");
	      }
	  }
	  finally {
		  System.out.println("dgdwguywe");
	  }}
	  public static void main(String args[]) {
		  eligible(11);
	  }
  }

