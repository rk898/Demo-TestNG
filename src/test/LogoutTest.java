package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LogoutTest extends login {
	
	@Test()
	public void Logout() {
			System.out.println(driver.getCurrentUrl());
			System.out.println("Logout begin....");
			//System.out.println(driver.getCurrentUrl());
		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'oxd-userdropdown-tab')]"))).click();
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']"))).click();
		
		    System.out.println("Logout Done");
		    System.out.println("Logout Completed");
		    driver.quit();
		
	}

}
