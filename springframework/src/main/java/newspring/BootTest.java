package newspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class BootTest {
	public static void main(String args[]) {
	  ApplicationContext obj=new ClassPathXmlApplicationContext("ConfigBoot.xml");
	  
	  Boot emp=(Boot)obj.getBean("Apptwo");
	  System.out.println(emp);
	  
	}
}
    
   
