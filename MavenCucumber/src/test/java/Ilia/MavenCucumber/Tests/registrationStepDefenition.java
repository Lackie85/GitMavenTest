package Ilia.MavenCucumber.Tests;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class registrationStepDefenition {
	
	WebDriver driver=null;
	
	@Given("^User goes to (.*)$")
	public void goToRegistrationPage(String URL1) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java Testing\\Programs\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(URL1);
	    
	    
	   
	}

	@When("^User fills in the given details regisrtation form regisration form$")
	public void fillsTheForm(DataTable testData) throws Throwable {
	   
		Map<String, String> testDataAsMap=testData.asMap(String.class, String.class);
		
	   List<String> testDataAsList = testData.asList(String.class);
	   System.out.println(testDataAsList.toString());
	   
	   driver.findElement(By.name("firstname")).sendKeys(testDataAsMap.get("FirstName"));
	   driver.findElement(By.name("lastname")).sendKeys(testDataAsMap.get("LastName"));
	   driver.findElement(By.name("reg_email__")).sendKeys(testDataAsMap.get("PhoneNumber"));
	   driver.findElement(By.name("reg_passwd__")).sendKeys(testDataAsMap.get("Password"));
	   
//	   With one dimetional list
//	   driver.findElement(By.name("firstname")).sendKeys(testDataAsList.get(0));
//	   driver.findElement(By.name("lastname")).sendKeys(testDataAsList.get(1));
//	   driver.findElement(By.name("reg_email__")).sendKeys(testDataAsList.get(2));
//	   driver.findElement(By.name("reg_passwd__")).sendKeys(testDataAsList.get(3));
	}

}
