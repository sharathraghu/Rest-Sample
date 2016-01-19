package test.poc.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Workspace/Angular Spring/AngularRestPoc/WebContent/WEB-INF/spring/applicationContext.xml");

		PojoAutoWire test = (PojoAutoWire) context.getBean("pojoAutoWire");

		System.out.println(test.getValue());
	}
}
