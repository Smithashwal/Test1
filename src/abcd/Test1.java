package abcd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
  
  @BeforeTest
  public void login() {
  System.out.println("Login is Successful"); 
  }
  @Test (priority = 1)
  public void addVendor() {
  System.out.println("Add Vendor is Successful"); 
  }
  @Test (priority = 2)
  public void addProduct() {
  System.out.println("Add Product is Successful"); 
  }
  @Test (priority = 3)
  public void addCurrency() {
  System.out.println("Add Currency is Successful"); 
  }
  @AfterTest
  public void logout() {
  System.out.println("Logout is Successful"); 
  }
}
