package Define;

public class Maxandmin {
	public void findMaxMin(int [][]x) {
		int sumoffivemin=0,sumoffivemax=0;
		for(int i=0;i<x.length;i++) {
			int max_=x[i][0],min_=x[i][0];
		   
			for(int j=0;j<x[i].length;j++) {
				if(max_<x[i][j]) {
					max_=x[i][j];
				}
			}
			for(int j=0;j<x[i].length;j++) {
				if(min_>x[i][j]) {
					min_=x[i][j];
				}
			}
		
		
		sumoffivemin+=min_;
		sumoffivemax+=max_;
		}
		System.out.println("SUm of five minimum nos:"+sumoffivemin);
		System.out.println("Sum of five maximum nos:"+sumoffivemax);
	}
		
		
	public static void main(String args[]){
		int [][]arr= {{1,2,3},{45,67,89},{98,9,12},{7,7,7},{65,43,32}};
		
		Maxandmin obj=new Maxandmin();
		obj.findMaxMin(arr);
	}

}
