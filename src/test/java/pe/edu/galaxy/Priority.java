package pe.edu.galaxy;

import org.testng.annotations.Test;

public class Priority {

	@Test (priority=2)
	public void Login() {
		System.out.println("Login");
		
	}
	
	@Test (priority=1)
	public void Login2() {

		System.out.println("Login2");
		
	}
}
