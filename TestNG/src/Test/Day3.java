package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am number 1!");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void webLoginCarLoan(String URL,String APIKey) {
		System.out.println("webloginCar");
		System.out.println(URL);
		System.out.println(APIKey);
	}
	
	@Test
	public void mobileLoginCarLoan() {
		System.out.println("mobileloginCar");
	}
	
	@BeforeTest
	public void beforeEveryMethod() {
		System.out.println("I will execute before every test method in day 3 class!");
	}
	
	@AfterTest
	public void afterEveryMethod() {
		System.out.println("I will execute after every test method in day 3 class!");
	}
	
	@Test(enabled=false) //testng helper attribute
	public void mobileSignInCarLoan() {
		System.out.println("mobilesigninCar");
	}

//	@Test(timeOut=4000)
	@Test(dataProvider="getData")
	public void mobileSignOutCarLoan(String username,String password) {
		System.out.println("mobilesignoutCar");
		System.out.println(username);
		System.out.println(password);
	}
	
//	@Test(dependsOnMethods= {"webLoginCarLoan","mobileSignOutCarLoan"})
	@Test
	public void loginAPICarLoan() {
		System.out.println("apiloginCar");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination-valid username and valid password - good credit history
		//2nd combination-valid username and valid password - no credit history
		//3rd combination-fraudulent credit history
		
		//write a multi-dimentional object array- this test case need to run 3 times with 2 values(username and password) in every run
		Object[][] data = new Object[3][2];
		data[0][0] = "firstsetusername"; //1st row 1st column
		data[0][1] = "password"; //1st row 2nd column
		
		data[1][0]="secondsetusername"; //2nd row 1st column
		data[1][1]="secondpassword";	//2nd row 2nd column	
		
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirspassword";
		
		return data;
		
				
		
		
	}
	

}
