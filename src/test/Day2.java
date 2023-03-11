package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	@Parameters({"URL"})
	@Test
	public void ploan2(String urlname)
	{
		System.out.println("Personal Loan 2");
		System.out.println(urlname);
	}
	@Test(groups= {"Smoke"})
	public void ploan3()
	{
		System.out.println("Personal Loan 3");
	}
	

}
