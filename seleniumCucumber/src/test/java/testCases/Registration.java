package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.*;
import modules.RegistrationPage;
import util.DriverFactory;
import util.ExcelFactory;

public class Registration {
	
	WebDriver driver = DriverFactory.getDriver(); 
	String firstName = ExcelFactory.getExcelValue("First name");
	String lastName = ExcelFactory.getExcelValue("Last name");
	String email = ExcelFactory.getExcelValue("Email");
	String password = ExcelFactory.getExcelValue("Password");

	@Given("the user is on the home page {string}")
	public void the_user_is_on_the_home_page(String url) {
		
	    driver = DriverFactory.getDriver();
	    //maximize the browser
	    driver.manage().window().maximize();
	    driver.get(url);
	}

	@When("user navigates to the registration page")
	public void user_navigates_to_the_registration_page() {
	    
		driver.findElement(By.className("ico-register")).click();	
	}

	@When("user adds all the required details")
	public void user_adds_all_the_required_details() {
	    		
		RegistrationPage registration = PageFactory.initElements(driver, RegistrationPage.class);
		registration.performRegistration(firstName, lastName, email, password);
	}

	@Then("the registration is successful")
	public void the_registration_is_successful() throws InterruptedException {
	    
		Thread.sleep(3000);
		//quit the browser
		driver.close();
	}
	
}
	