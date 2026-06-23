package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends login {
	
	@Test()
	public void LogInsideURL() {
		driver.findElement(By.xpath("//div/input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//div/input[@name=\"password\"]")).sendKeys("admin123");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div/button")).click();
		System.out.println(driver.findElement(By.xpath("//div/span/h6")).getText());
		
		 System.out.println("Login Done");
		
	}

}
