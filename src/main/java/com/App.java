package com;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.StudentBean;
import com.bean.AddressBean;
import com.bean.AuthorBean;
import com.bean.BookBean;
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
//    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	System.out.println(context);
//    	StudentBean s1 = context.getBean("studentBean",StudentBean.class);
//    	StudentBean s2 = context.getBean("studentBean",StudentBean.class);
//    	
//    	System.out.println(s1);
//    	System.out.println(s2);
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	System.out.println(context);
//    	AddressBean a1 = context.getBean("addressBean",AddressBean.class);
//    	AddressBean a2 = context.getBean("addressBean",AddressBean.class);
//    	
//    	System.out.println(a1);
//    	System.out.println(a2);
    	
//    	AuthorBean author1 = context.getBean("authorBean",AuthorBean.class);
//    	AuthorBean author2 = context.getBean("authorBean",AuthorBean.class);
    	
    	BookBean book1 = context.getBean("bookBean",BookBean.class);
    	BookBean book2 = context.getBean("bookBean",BookBean.class);
    	
    	System.out.println(book1);
    	System.out.println(book2);
    	
    	
    	//        System.out.println( "Hello World!" );
    }
}
