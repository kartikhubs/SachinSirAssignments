package collections;
import java.util.ArrayList;
class Studdetails{
	private String studname;
	private int studid;
	private int studroll;
	private String studcity;
	
	Studdetails(String studname,int studid,int studroll,String studcity){
		this.studname=studname;
		this.studid=studid;
		this.studroll=studroll;
		this.studcity=studcity;
	}
	
	public String toString() {
		return "[ Student name is :"+studname+" "+"Student id is :"+studid+" "+"Student roll no is :"+studroll+" "+"Student city is :"+studcity+" "+"]";
	}
}
public class Callingdetails {
	   public static void main(String args[]) {
		   ArrayList<Student>obj=new ArrayList<Student>();
		   obj.add(new Student("KARTIK",123,74,"JABALPUR"));
		   for(Student s:obj) {
			   System.out.println(s);
		   }
		   
	   }
	}
