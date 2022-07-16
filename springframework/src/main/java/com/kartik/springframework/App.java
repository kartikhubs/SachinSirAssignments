package com.kartik.springframework;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
          ApplicationContext obj=new ClassPathXmlApplicationContext("config.xml");
          
          POJO pj=(POJO) obj.getBean("Appone");
          System.out.println(pj);
}
}