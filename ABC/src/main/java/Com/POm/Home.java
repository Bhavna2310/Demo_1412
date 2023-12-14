package Com.POm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
		
		@FindBy(xpath="//input[@id='mobileNumber']")
		WebElement user;
		
		
	
		public Home(WebDriver driver) {
			driver=this.driver;
			PageFactory.initElements(driver, this);
		}
		
		public void verifyuser() {
			 user.sendKeys("8983537692");
		
		
		
	}
		
}
