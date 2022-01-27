package com.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before(order=0)
    public void connectToDataBase() {
      System.out.println("Connect to DB");
	}
	
	@After(order=0)
	public void disConnectToDataBase() {
		System.out.println("DisConnect to DB");
	}
	
	@Before(order=1)
    public void lauchBrowser() {
      System.out.println("lauch the Browser");
	}
   @After(order=1)
   public void closeBrowser() {
	System.out.println("Close the Browser");   
   }
   
   @Before(order=2)
   public void login() {
	   System.out.println("Login the Application");
   }
   @After(order=2)
	   public void logout() {
		   System.out.println("Logout the Application");
	   }
   }

