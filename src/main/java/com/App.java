package com;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.StudentBean;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	StudentBean s1 = new StudentBean();
//    	StudentBean s2 = new StudentBean();
//    	
//    	System.out.println(s1);
//    	System.out.println(s2);
    	
    	//ios container >
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	System.out.println(context);
    	StudentBean s1 = context.getBean("studentBean",StudentBean.class);
    	StudentBean s2 = context.getBean("studentBean",StudentBean.class);
    	
    	System.out.println(s1);
    	System.out.println(s2);
    	
    	//        System.out.println( "Hello World!" );
    }
}
