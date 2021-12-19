package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C1 {
	
	@Test
	public void tm1() {
		
		
		Reporter.log("=================== test A1 started ==============", true);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Reporter.log("=================== browser started ==============", true);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Reporter.log("=================== window maximized ==============", true);
		
		driver.get("https://www.facebook.com/");
		Reporter.log("=================== facebook opened ==============", true);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@yahoo.com");
		Reporter.log("=================== user name entered ==============", true);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("demo12345");
		Reporter.log("=================== password entered ==============", true);
		
		Reporter.log("==============test A1 finished =====================", true);
		
	}

}
