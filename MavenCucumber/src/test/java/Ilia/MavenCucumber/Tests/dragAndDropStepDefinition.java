package Ilia.MavenCucumber.Tests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import justTests.DragNDrop;

public class dragAndDropStepDefinition {
	
	WebDriver driver = null;
	
	@Given("^User go to (.*)$")
	public void navigateToWebPage(String URL) throws Throwable {
				
	   System.setProperty("webdriver.chrome.driver", "F:\\Java Testing\\Programs\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get(URL);
	   System.out.println("User is on Automation Demo Site");
	}
	
	@When("^User drag and drop (.*) on the (.*)$")
	public void user_drag_and_drop_object_on_the_field(String id, String Drop) throws Throwable {
		WebElement object= driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement drop= driver.findElement(By.id("trash"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(object, drop).build().perform();
	    
	}

	



}
