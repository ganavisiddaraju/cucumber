package case_cucum.cucumb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class registerdef {
	Select sel;

	WebDriver driver;
	@Given("^user should be in sign_up page$")
	public void user_should_be_in_sign_up_page() throws Throwable {
		driver=driverclass.getDriver("chrome");
		  driver.get("http://10.232.237.143:443/TestMeApp");
		  Assert.assertEquals(driver.getTitle(), "Home");
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		  driver.findElement(By.linkText("SignUp")).click();
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  Assert.assertEquals(driver.getTitle(), "Sign Up");
	    
	}

	@When("^user should enter username as\"([^\"]*)\"$")
	public void user_should_enter_username_as(String arg1) throws Throwable {
		
		 driver.findElement(By.name("userName")).sendKeys("sanavihs");
	    
	}

	@When("^enter firstname as \"([^\"]*)\"$")
	public void enter_firstname_as(String arg1) throws Throwable {
		 driver.findElement(By.name("firstName")).sendKeys("sanavi");
		    
	}

	@When("^enter lastname as \"([^\"]*)\"$")
	public void enter_lastname_as(String arg1) throws Throwable {
		 driver.findElement(By.name("lastName")).sendKeys("hs");
		    
	}

	@When("^enter password as\"([^\"]*)\"$")
	public void enter_password_as(String arg1) throws Throwable {
		 driver.findElement(By.name("password")).sendKeys("password123");
		    
	}

	@When("^enter confirm password as \"([^\"]*)\"$")
	public void enter_confirm_password_as(String arg1) throws Throwable {
		 driver.findElement(By.name("confirmPassword")).sendKeys("password123");
		    
	}

	@When("^selcet gender as \"([^\"]*)\"$")
	public void selcet_gender_as(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@type='radio' and @value='Female']")).click();
	}

	@When("^enter email as \"([^\"]*)\"$")
	public void enter_email_as(String arg1) throws Throwable {
		 driver.findElement(By.name("emailAddress")).sendKeys("ganavi@gmail.com");
		    
	}

	@When("^enter Mobile Number as \"([^\"]*)\"$")
	public void enter_Mobile_Number_as(String arg1) throws Throwable {
		 driver.findElement(By.name("mobileNumber")).sendKeys("9876543219");
	}

	@When("^enter DOB as \"([^\"]*)\"$")
	public void enter_DOB_as(String arg1) throws Throwable {
		 driver.findElement(By.name("dob")).sendKeys("24/3/1998");
	}

	@When("^enter Address  as \"([^\"]*)\"$")
	public void enter_Address_as(String arg1) throws Throwable {
		driver.findElement(By.name("address")).sendKeys("mysore karnataka");
	}

	@When("^select Security Question  as \"([^\"]*)\"$")
	public void select_Security_Question_as(String arg1) throws Throwable {
		 sel=new Select (driver.findElement(By.name("securityQuestion")));
	}

	@When("^enter Answer as\"([^\"]*)\"$")
	public void enter_Answer_as(String arg1) throws Throwable {
		 sel.selectByIndex(1);
         driver.findElement(By.name("answer")).sendKeys("blue");
	    
	}

	@When("^user should click \"([^\"]*)\" button$")
	public void user_should_click_button(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit' and @value='Register']")).click();
	}

	@Then("^user must be in Login page$")
	public void user_must_be_in_Login_page() throws Throwable {
		  Assert.assertEquals(driver.getTitle(), "Login");
		  driver.close();
	}

}
