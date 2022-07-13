package dsa;

class Implement{
	public static int[]getdetails(){
		return new int[] {1,2,3,4,5};
	}
}
public class ArrayDS {
 public static void main(String args[]) {
	 int []arr=new int[5];
	 Implement obj=new Implement();
	 arr=obj.getdetails();
	 for(int x:arr) {
		 System.out.println(x);
	 }
 }
 
}
	 
	 