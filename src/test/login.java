package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class login{
	public static  WebDriver driver;
	
	
	@BeforeSuite
	public void Setup() 
	{
		System.setProperty( "webdriver.edge.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		System.out.println("E1");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
