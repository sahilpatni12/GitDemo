package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@SmokeTest")
	public void beforevalidation()
	{
		System.out.println("Before");
	}
	
	@After("@SmokeTest")
	public void aftervalidation()
	{
		System.out.println("After");
	}

	@Before("@Regtest")
	public void before()
	{
		System.out.println("Before Regtest");
	}
	
	@After("@Regtest")
	public void after()
	{
		System.out.println("After Regtest");
	}
	
}
