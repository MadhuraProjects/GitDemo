package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Parameters({ "URL" })
	@Test
	public void MobileCarLoan(String urlname) {
		System.out.println("Mobile car");
		System.out.println(urlname);
	}
	
	
//this test will run 3 times	
@Test(dataProvider="getData")
public void WebCarLoan(String username, String password)
{
	System.out.println("Web car");
	System.out.println(username);
	System.out.println(password);
}
@Test(groups= {"Smoke"})
public void APICarLoan()
{
	System.out.println("API car");
}

@DataProvider
public Object[][] getData()
{
	//1st combination - username and password of good credit history
	//2nd combination - username and password of no credit history
	//3rd combination - username and password of fradulent credit history
	
	Object[][] data= new Object[3][2];
	data[0][0]="uname 1";
	data[0][1]="pwd 1";
	data[1][0]="uname 2";
	data[1][1]="pwd 2";
	data[2][0]="uname 3";
	data[2][1]="pwd 3";
	return data;
}
}
