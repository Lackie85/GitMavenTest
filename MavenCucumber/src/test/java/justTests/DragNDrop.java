package justTests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragNDrop {

	public static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Java Testing\\Programs\\chromedriver_win32\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		
		WebElement dropHere=driver.findElement(By.id("todrag"));
		
		
		WebElement object= driver.findElement(By.xpath("//span[@draggable='true'][2]"));
		//WebElement object= driver.findElement(By.id("todrag"));
		WebElement dragg= driver.findElement(By.id("mydropzone"));
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame'][1]")));
		object.click();
		Actions act=new Actions(driver);
		act.dragAndDrop(object, dragg).build().perform();
		
		
		ScreenshotMaker call=new ScreenshotMaker();
		call.Screenshoter("Testing");
	
		
		System.out.println("TestDone");
		
		Thread.sleep(800);
		driver.quit();
	    

		
	}

}
