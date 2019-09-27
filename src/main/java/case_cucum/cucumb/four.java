package case_cucum.cucumb;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class four {
	WebDriver driver;
	@Given("^User is in the Login Page$")
	public void user_is_in_the_Login_Page() throws Throwable {
		driver=driverclass.getDriver("chrome");
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  
		
		 
	    
	}

	@When("^User enters valid credentials and performs Login$")
	public void user_enters_valid_credentials_and_performs_Login() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Home");
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  driver.findElement(By.linkText("SignIn")).click();
	}

	@Then("^User must be navigated to the Home Page$")
	public void user_must_be_navigated_to_the_Home_Page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Login");
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		 driver.findElement(By.name("password")).sendKeys("Password123");
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	}

	@Given("^Alex should be home page$")
	public void alex_should_be_home_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Home");
		
	}

	@When("^Alex enters the first four letter of the product$")
	public void alex_enters_the_first_four_letter_of_the_product() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/input")).sendKeys("head");
	    
	}

	@When("^selects the product from the list and clicks search button$")
	public void selects_the_product_from_the_list_and_clicks_search_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		
	  
	}

	@Then("^Alex redirected to the product page$")
	public void alex_redirected_to_the_product_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Search");
	    
	}

	@Given("^Alex should be in home page$")
	public void alex_should_be_in_home_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Home");
	}

	@When("^Alex enters  first four letter of unavailable product$")
	public void alex_enters_first_four_letter_of_unavailable_product() throws Throwable {
		driver.findElement(By.id("myInput")).click();
		 WebElement d=driver.findElement(By.xpath("//input[@id='myInput' and @name='products']"));
		 d.sendKeys(new String[] {"abcd"});

	}

	@Then("^no product message will be displayed$")
	public void no_product_message_will_be_displayed() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit' and @name='val']")).click();
		 String text=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/h3")).getText();
		 String temp="Sorry no products available in this category. Please try some other";
		 if(text.equals(temp)){
		 System.out.println("successful");
		 driver.close();
		 }
		 else{
		 System.out.println("unsuccessful");
		 driver.close();
		 }
		 }

	
	@When("^alex enter product name and click find details button$")
	public void alex_enter_product_name_and_click_find_details_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/input")).sendKeys("head");
	   
	}

	@When("^try proceed with payment  without selecting product$")
	public void try_proceed_with_payment_without_selecting_product() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	   
	}

	@Then("^no cart symbol is displayed$")
	public void no_cart_symbol_is_displayed() throws Throwable {
		 Assert.assertEquals(driver.getTitle(), "View Cart");
	   
	}


}
