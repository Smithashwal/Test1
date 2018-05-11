package abcd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {

	  @Test (priority = 4)
	  public void deleteVendor() {
	  System.out.println("Delete Vendor is Successful"); 
	  }
	  @Test (priority = 5)
	  public void deleteProduct() {
	  System.out.println("Delete Product is Successful"); 
	  }
	  @Test (priority = 6)
	  public void deleteCurrency() {
	  System.out.println("Delete Currency is Successful"); 
	  }
	  
}
