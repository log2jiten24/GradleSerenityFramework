package pages;

import net.thucydides.core.annotations.Step;

public class OrangeHRM {
	
	OrangeHRMPages pages ;
	
	
	@Step ("verify the dashboad title")
	public void verifytitle () 
	{
		
		pages.verifyHomePagetitle();
		
	}
	
	@Step ("Enter the OrangeHRM Credentials")
	public void EnterHRMCredentials()
	{
		
		pages.Entercredentials("Admin", "admin123");
		
	}
	
	@Step ("Verify the Orange HRM Dashboard ")
	public void verifyHRMDashboard () throws Exception 
	{
		pages.verifyLoginDashboard();
		
	}
	
	@Step("Logout Orange HRM Page ")
	public void logoutOrangeHRMPage () 
	{
		
		pages.logout();
	}
	

}
