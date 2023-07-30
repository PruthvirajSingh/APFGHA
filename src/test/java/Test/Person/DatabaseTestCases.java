package Test.Person;

import org.testng.annotations.Test;

import Base.BaseClass;

public class DatabaseTestCases  extends BaseClass{
	@Test
	public void databaseTesting() throws InterruptedException {
		login.loginToSandBox(prop.getProperty("AdminUsername"),prop.getProperty("AdminPassword"));
		database.salesForceInspector();
		
	}
}
