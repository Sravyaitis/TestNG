package Test;

import org.testng.annotations.Test;

public class Day4 {
	@Test
	public void webLoginHomeLoan() {
		System.out.println("webloginHome");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileLoginHomeLoan() {
		System.out.println("mobileloginHome");
	}
	
	@Test
	public void loginAPIHomeLoan() {
		System.out.println("apiloginHome");
	}
}
