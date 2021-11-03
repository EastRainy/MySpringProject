package test01;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args){
		
		/*
		SpringTest sp = new SpringTest();
		sp.method();
		*/
		GenericApplicationContext ct = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		SpringTest test =  ct.getBean("good", SpringTest.class);
		test.method();
		
		ct.close();
		
	}

}
