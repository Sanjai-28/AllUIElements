package training1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement field1 = driver.findElement(By.xpath("//button[contains(.,'Copy Text')]"));
		
		Actions ac=new Actions(driver);
		
		ac.doubleClick(field1).perform();
		
		

	}

}
