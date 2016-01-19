package test.poc.autowire;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextFactory implements ApplicationContextAware {

	    private static ApplicationContext applicationContext = null;
	    
	    public static ApplicationContext getApplicationContext() {
			return applicationContext;
		}

		@Override
	    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
	        this.applicationContext = applicationContext;
	 }
}
