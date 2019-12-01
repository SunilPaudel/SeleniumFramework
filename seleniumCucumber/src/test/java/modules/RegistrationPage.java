/**
 * 
 */
package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author sunilpaudel
 * This class is completely based on the page factory model of POM
 * This class contains all the elements and the methods required for the action to be performed in the registration page.
 */
public class RegistrationPage {
	
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using = "FirstName")
	@CacheLookup
	WebElement elFirstName;

	@FindBy(how = How.ID, using = "LastName")
	WebElement elLastName;
	
	@FindBy(how = How.ID, using = "Email")
	WebElement elEmail;
	
	@FindBy(how = How.ID, using = "Password")
	WebElement elPassword;
	
	@FindBy(how = How.ID, using = "ConfirmPassword")
	WebElement elConfirmPassword;
	
	public void performRegistration(String firstName, String lastName, String email, String password) {
		
		elFirstName.sendKeys(firstName);
		elLastName.sendKeys(lastName);
		elEmail.sendKeys(email);
		elPassword.sendKeys(password);
		elConfirmPassword.sendKeys(password);
		
	}
	
}
