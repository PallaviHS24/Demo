package LOGIN_Testcases;

import org.testng.annotations.Test;


public class Login_1_Test {


	public void Login_TC_001() throws Throwable{
		  
	  }
	
	
	  @Test(dependsOnMethods = "TC_Login_003")
      public void Login_TC_002() throws Throwable {
    	  Thread.sleep(30001);
    	  System.out.println("Second Test Case"); 
	  }
      
	  
	  @Test(enabled = true)
	  public void TC_Login_003() {
		  System.out.println("The third test case");
	  }
	  
//	  @Test(invocation count = 3)
//	  public void TC_Login_004() {
//		  System.out.println("The fourth test case");
//	  }
	  
	}


