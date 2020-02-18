package pages;

import org.openqa.selenium.By;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OrangeHRMPages extends PageObject {
	
	
	public void verifyHomePagetitle () 
	{
		
		String title = getDriver().getTitle();
		Assert.assertEquals("OrangeHRM", title);
		
	}
	
	
	public void Entercredentials (String Username , String Password)
	{
		
	
		$(By.xpath("//input[@id='txtUsername']")).shouldBeVisible();
		$(By.xpath("//input[@id='txtUsername']")).typeAndTab(Username);
		
		$(By.xpath("//input[@id='txtPassword']")).shouldBeVisible();
		$(By.xpath("//input[@id='txtPassword']")).typeAndEnter(Password);

	}
	
	
	public void verifyLoginDashboard() throws Exception 
	{
		Thread.sleep(2000);
		String title = getDriver().getTitle();
		Assert.assertEquals("OrangeHRM", title);
		
	}
	

	public void logout () 
	{
		
		$(By.xpath("//a[@id='welcome']")).shouldBeVisible();
		$(By.xpath("//a[@id='welcome']")).click();
		WebElementFacade Logout =   $(By.xpath("//a[contains(text(),'Logout')]"));
		Logout.shouldBeVisible();
		Logout.click();
		
	}
	

}
