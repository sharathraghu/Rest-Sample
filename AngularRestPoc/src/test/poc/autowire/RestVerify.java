package test.poc.autowire;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

import poc.angular.dm.Population;

public class RestVerify {
	
	private RestTemplate restTemplate;
	
	@Before
	public void setUp(){
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Workspace/Angular Spring/AngularRestPoc/WebContent/WEB-INF/spring/applicationContext.xml");
		restTemplate = (RestTemplate) context.getBean("restTemplate");
	}
	
	/*@Test
	public void testCustomers() {
		Customers[] customers = restTemplate.getForObject("http://localhost:8080/AngularRestPoc/services/customers", Customers[].class, new Object[]{});
		assertNotNull("no customer",customers);
	} */
	
	@Test
	public void testZipPopulation() {
		Map<String, String> req = new HashMap<String, String>();
		req.put("zip", "93065");
		Population population = restTemplate.getForObject("http://localhost:8080/AngularRestPoc/services/zippoulation/{zip}", Population.class, req);
		assertNotNull("No Population",population);
	}
}
