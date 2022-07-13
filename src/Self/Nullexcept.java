package Self;

import java.util.InputMismatchException;
import java.io.IOException;

public class Nullexcept {
	public static void main(String args[]) {
    try {
    	int x=Integer.parseInt("123d");
    	System.out.println("all fine");
    }
    catch(NumberFormatException e) {
    	e.printStackTrace();
    }
	}
}