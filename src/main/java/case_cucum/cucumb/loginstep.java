package case_cucum.cucumb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class loginstep {
	WebDriver driver;
	@Given("^user not logged$")
	public void user_not_logged() throws Throwable {
		driver=driverclass.getDriver("chrome");
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		 Assert.assertEquals(driver.getTitle(), "Home");
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  driver.findElement(By.linkText("SignIn")).click();
		Assert.assertEquals(driver.getTitle(), "Login");
		
	}

	@When("^user perform loggin using asroopa(\\d+) and ash(\\d+)$")
	public void user_perform_loggin_using_asroopa_and_ash(int arg1, int arg2) throws Throwable  {
		driver.findElement(By.name("userName")).sendKeys("asroopa97");
		 driver.findElement(By.name("password")).sendKeys("ash123");
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	    // Assert.assertEquals(driver.getTitle(), "Home");
	   
	}

	@Then("^logged in$")
	public void logged_in() throws Throwable {
		 Assert.assertEquals(driver.getTitle(), "Home");
		 driver.close();
	}

	@When("^user perform loggin using lalitha and Password(\\d+)$")
	public void user_perform_loggin_using_lalitha_and_Password(int arg1) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		 driver.findElement(By.name("password")).sendKeys("Password123");
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	   //  Assert.assertEquals(driver.getTitle(), "Home");
	   
	}


}
