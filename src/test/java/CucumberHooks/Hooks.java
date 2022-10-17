package CucumberHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks

{

	  @Before(order = 1)
	  public void setUpDB(Scenario Sc)
	  {
		  System.out.println("Initiate database connection");
		  System.out.println(Sc.getName());
	  }
	  
	  @Before(order = 2)
	  public void setUpBrowser()
	  {
		  System.out.println("Launch Browser");
	  }
	  
	  @BeforeStep
	  public void beforeStepMethod() 
	  {
		  System.out.println("Took Screenshot");
	  }
	  
	  @AfterStep
	  public void afterStepMethod() 
	  {
		  System.out.println("wait for minute");
	  }  
	  
	  @After(order = 2)
	  public void tearDownDB(Scenario Sc)
	  {
		  System.out.println("close DB Connection");
		  System.out.println(Sc.getName());
	  }
	  
	  @After(order = 1)
	  public void tearDownBrowser()
	  {
		  System.out.println("close all browsers");
	  }
}
