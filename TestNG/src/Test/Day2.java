package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"Smoke"})
	public void loan() {
		System.out.println("happy");
	}
	
	@BeforeTest
	public void preRequisite() {
		System.out.println("I will execute first!");
	}

}
