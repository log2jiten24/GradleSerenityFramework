package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)

public class MyFirstTestSuite {
	
	
	@Managed
	//Annotation that marks a WebDriver field as one that is managed by the Test Runner.
	//The Serenity Test Runner will instantiate this WebDriver before the tests start,and close it once they have all finished.

	WebDriver driver ;
	String url = "https://www.google.com/";
	

	
	@Test
	public void MyGoogleSearch () {
		
	driver.get(url);
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Sydney weather");

	driver.findElement(By.xpath("(//input[@name = 'btnK' and @value = 'Google Search'])[1]")).click();
	
	
		
		
	}

}
