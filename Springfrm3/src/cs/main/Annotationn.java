package cs.main;

import java.beans.beancontext.BeanContextChildComponentProxy;
import java.beans.beancontext.BeanContextContainerProxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cs.bean.Emp;
import cs.res.Empres;

public class Annotationn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String pth ="cs/Config/ApplicationContext.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext(pth);
//		Emp s1 = (Emp) context.getBean("emp");
//		s1.disp();
//		
		
	
		ApplicationContext jctx = new AnnotationConfigApplicationContext(Empres.class);
		Emp s1 = (Emp) jctx.getBean("emp");
		s1.disp();

	}

}
