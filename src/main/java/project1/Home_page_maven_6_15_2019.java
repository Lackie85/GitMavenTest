package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page_maven_6_15_2019 {
	
	public static WebDriver driver=null;
	@FindBy(id="email") //@FindBy(locator(id, name,xpath,etc)=nameOfLocator)
	private WebElement emailid;
	@FindBy(id="pass")
	private WebElement passid;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginbutton;
	
	//constructor 
	public Home_page_maven_6_15_2019(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String email) {
		emailid.sendKeys(email);
	}
	public void password(String pwd) {
		passid.sendKeys(pwd);
	}
	
	public void clickbutton() {
		loginbutton.click();
	}

}
