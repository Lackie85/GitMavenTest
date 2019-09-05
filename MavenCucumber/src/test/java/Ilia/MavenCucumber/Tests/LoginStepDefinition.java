package Ilia.MavenCucumber.Tests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver = null;
	
	@Given("^User (?:is on|navigates to|opens) (.*)$")
	public void navigateToUrl(String URL) throws Throwable {
				
	   System.setProperty("webdriver.chrome.driver", "F:\\Java Testing\\Programs\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get(URL);
	   System.out.println("User is on store.demoqa.com");
	}

	@When("^User clicks on MyAccount link$")
	public void user_clicks_on_MyAccount_link() throws Throwable {
		driver.findElement(By.linkText("Dismiss")).click();
		driver.findElement(By.linkText("My Account")).click();
		System.out.println("User clicked on MyAccount");
	}

	@When("^User logs in using username (.*) and password (.*)$")
	public void user_logs_in_using_valid_username_and_password(String username, String password) throws Throwable {
		//driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("login_username")).sendKeys(username);
		driver.findElement(By.name("login_password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.id("password")).sendKeys(password);
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println("User logged with right credential");
	}

	@Then("^User is taken to the myaccount page$")
	public void user_is_taken_to_the_myaccount_page() throws Throwable {
		System.out.println("User is taken to the myaccount page");
		WebElement logoutButton=null;
		try {
			driver.findElement(By.xpath("//a[@onclick='return logout();']"));
			System.out.println("Element found");
		} catch (Exception exp) {
			System.out.println("Not able to locate element");
			//throw exp;
		}
		//Assert.assertEquals("Two values don't match", 80, 90);
		Assert.assertNotNull("LogoutButton is not available", logoutButton);
	}

	
	
	
	
}
