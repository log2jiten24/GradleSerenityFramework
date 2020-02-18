package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)

public class MySecondTestSuite extends PageObject {

	@Managed
	//Annotation that marks a WebDriver field as one that is managed by the Test Runner.
	//The Serenity Test Runner will instantiate this WebDriver before the tests start,and close it once they have all finished.
    WebDriver driver ;
	
	String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	
	
	
	@Test
	public void OrangeHRMLogin () throws Exception {
		
		// Maximize window
		driver.manage().window().maximize();
		
        //load the url
		driver.get(url);
        //wait for seconds 
       // waitFor(10);
        //wait for text to appear
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//waitForTitleToAppear("Orange HRM");
//        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
//        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//        waitOnPage();
//        driver.findElement(By.xpath("//a[@id='welcome']")).click();
//        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		  WebElementFacade username =   $(By.xpath("//input[@id='txtUsername']"));
		  username.shouldBeVisible();
		  username.typeAndTab("Admin");
		  
		  WebElementFacade Password =   $(By.xpath("//input[@id='txtPassword']"));
		  Password.shouldBeVisible();
		  Password.typeAndEnter("admin123");
		  
		  $(By.xpath("//a[@id='welcome']")).click();
		  
//		  WebElementFacade Logout =   $(By.xpath("//a[contains(text(),'Logout')]"));
//		  Logout.shouldBeVisible();
//		  Logout.click();
		  
		
        
		
	}
}
