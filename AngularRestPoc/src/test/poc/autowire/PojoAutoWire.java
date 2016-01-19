package test.poc.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PojoAutoWire {

	
	private DIPojoClass diPojoClass;
	
	public DIPojoClass getDiPojoClass() {
		return diPojoClass;
	}
	
	@Autowired
	@Qualifier("diPojoClass1")
	public void setDiPojoClass(DIPojoClass diPojoClass) {
		this.diPojoClass = diPojoClass;
		System.out.println("Inside Setter");
	}
	
	public String getValue() {
		return this.diPojoClass.getValue();
	}
}
