package com.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("spring.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Object o1= bf.getBean("t");
		Object o2= bf.getBean("t");
		Object o3= bf.getBean("t");
		
		//ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		 // Object o1= ac.getBean("t");
		//Object o2= ac.getBean("t");
		//Object o3= ac.getBean("t");
		
		Test t1=(Test)o1;
		t1.hello();

		
	}

}
