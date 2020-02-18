package testcases;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.OrangeHRM;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class LoginApplicationPOMModel extends PageObject {
	
	@Steps
	OrangeHRM homepgsteps ;

	@Managed
	//Annotation that marks a WebDriver field as one that is managed by the Test Runner.
	//The Serenity Test Runner will instantiate this WebDriver before the tests start,and close it once they have all finished.
    WebDriver driver ;
	
	String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	
	@Test
	public void LoginOrangeHRMLogin () throws Exception {
		
		 // Maximize window
		  driver.manage().window().maximize();
		  //load the url
		  driver.get(url);
		  //call the home page steps - all the steps methods 
		  homepgsteps.verifytitle();
		  homepgsteps.EnterHRMCredentials();
		  homepgsteps.verifyHRMDashboard();
		  homepgsteps.logoutOrangeHRMPage();
			
	}
}
