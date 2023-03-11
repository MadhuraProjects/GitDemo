package test;

import org.testng.annotations.Test;

public class Day4 {
	@Test(groups= {"Smoke"})
	public void MobileHomeLoan()
	{
		System.out.println("Mobile home");
	}
	@Test
	public void WebHomeLoan()
	{
		System.out.println("Web home");
	}
	@Test
	public void APIHomeLoan()
	{
		System.out.println("API home");
	}

}
