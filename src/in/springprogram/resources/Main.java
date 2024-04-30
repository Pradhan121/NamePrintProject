package in.springprogram.resources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.springprogram.bean.Student;

public class Main {
public static void main(String args[]) {
	String s="/in/springprogram/sour/applicationContext.xml";
	ApplicationContext con=new ClassPathXmlApplicationContext(s);
	
	Student st=(Student) con.getBean("stdId");
	  st.demo();
}
}
