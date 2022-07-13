package Self;
import java.util.*;

public class Args{
	public static void main(String args[]) {
		try {
			System.out.println("A");
			throw new NullPointerException("HELLO");
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
}