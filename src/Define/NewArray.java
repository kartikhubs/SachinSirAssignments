package Define;



public class NewArray {
	 static int sumoffivemax=0;
	static int sumoffivemin=0;
	
	public void findMaxMin(int []x) {
		
	    
		int max_=x[0],min_=x[0];
		for(int i=0;i<x.length;i++) {
			if(max_<x[i]) {
				max_=x[i];
			}
			
		}
		
		for(int i=0;i<x.length;i++) {
			if(min_>x[i]) {
				min_=x[i];
			}
		}
		sumoffivemax+=max_;
		sumoffivemin+=min_;
        
		
	}
	
	public static void main(String args[]){
		int [][]x= {{1,2,3},{45,67,89},{54,65,13},{76,12,34},{89,76,32}};
		
		NewArray obj=new NewArray();
		for(int i=0;i<5;i++) {
			obj.findMaxMin(x[i]);
		
			
			
			
			
		}
		System.out.println(sumoffivemax);
		System.out.println(sumoffivemin);
			
		}
}
