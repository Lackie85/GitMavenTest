package project1_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import project1.Home_page_maven_6_15_2019;

public class HomePageTest_6_15_19 {
	
		public static WebDriver driver=null;
	 
		@Test
	    public void f() {
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  Home_page_maven_6_15_2019 home=new Home_page_maven_6_15_2019(driver);
		  home.enterEmail("search");
		  home.password("password");
		//what happened
		  //one more change
		  home.clickbutton();
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "F:\\Java Testing\\EclipseWorkspace\\New Selenium\\ChromeDriver\\chromedriver.exe");
				driver=new ChromeDriver();
				
				String url ="https://www.facebook.com/";
				driver.get(url);
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

}
	
