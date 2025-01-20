package training1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshot {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String dst=System.getProperty("user.dir")+"//target//"+"name.jpg";
		
		FileHandler.copy(src, new File(dst));

	}

}
