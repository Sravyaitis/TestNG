package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterTest
	public void lastExecution() {
	}
	
	@Test
	public void demo() {
		System.out.println("hello");
//		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am number 1 from last!");
	}

	@Test
	public void secondTest() {
		System.out.println("Bye");
	}
}
