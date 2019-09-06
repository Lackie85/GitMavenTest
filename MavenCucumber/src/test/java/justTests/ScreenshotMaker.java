package justTests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotMaker {
	
	

	public void Screenshoter(String name) throws IOException {
	
		
		String dir="F:\\Java Testing\\Screenshot\\";
		
		File sourseFile=((TakesScreenshot)DragNDrop.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourseFile, new File(dir+name+".png"));
	}

}
