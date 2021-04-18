package pe.edu.galaxy;

import org.testng.annotations.Test;

public class DependyOnGroups {

	@Test(groups = { "verifyaccount" })
	public void checkData() {
		System.out.println("View Your Dashboardd");
	}

	@Test(groups = { "openbrowser" })
	public void getUrl() {
		System.out.println("Browser Opened Successfully");
	}

	@Test(groups = { "login" })
	public void logIn() {
		System.out.println("Login Into The Account");
	}

	@Test(groups = { "logout" })
	public void logOut() {
		System.out.println("Closing The Account");
	}

}
