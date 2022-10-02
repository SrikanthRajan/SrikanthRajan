package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends Baseclass {
	
	
	
@Test
	public  void runCreate() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SRIKANTH");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RAJAN");
		
		driver.findElement(By.name("submitButton")).click();
		driver.close();
}
}






