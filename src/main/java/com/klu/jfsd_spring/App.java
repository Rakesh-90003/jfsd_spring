package com.klu.jfsd_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

    	College cl=(College)context.getBean("col1");
    	System.out.println(cl);
    	System.out.println("Hello JFSD");
    }
}
  