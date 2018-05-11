package abcd;

import org.testng.annotations.Test;

public class Test3 {
	@Test (groups = {"sanity", "regression"}, priority=1)
	public void login() {
	System.out.println("Login is Successful");  
	}
	@Test (groups = {"sanity", "regression"}, priority=6)
	public void logout() {
	System.out.println("Logout is Successful");  
	}
	@Test (groups = {"sanity"}, priority=2)
	public void search() {
	System.out.println("Search is Successful");  
	}
	@Test (groups = {"regression"}, priority=3)
	public void advancedSearch() {
	System.out.println("Advanced Search is Successful");  
	}
	@Test (groups = {"regression"}, priority=4)
	public void billPayment() {
	System.out.println("Bill Payment is Successful");  
	}
	@Test (groups = {"sanity", "regression"}, priority=5)
	public void prepaidRecharge() {
	System.out.println("Prepaid Recharge is Successful");  
	}
}
