package pe.edu.galaxy;

import org.testng.annotations.Test;

public class DependsOnTests {

	@Test
	public void openBrowser() {
		System.out.println("Open your Browser");
	}

	@Test
	public void doLogin() {
		System.out.println("Login with your Credentials");
	}

	@Test(dependsOnMethods = { "doLogin" })
	public void UpdateCreditCardInformation() {
		System.out.println("Updating Credit Card Information!");
	}

	@Test(dependsOnMethods = { "UpdateCreditCardInformation" })
	public void doLogout() {
		System.out.println("Logout of the application");
	}

}
