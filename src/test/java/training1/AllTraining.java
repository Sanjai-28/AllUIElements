package training1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllTraining {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Mouse Hover
		
		/*WebElement ho = driver.findElement(By.xpath("//button[contains(text(),'Point Me')]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,650)");
		js.executeScript("arguments[0].scrollIntoView();",ho);
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(ho).perform();*/
		
		//alert
		
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]")).click();
		
		driver.switchTo().alert().accept();*/
		
		String window=driver.getWindowHandle();
		
		System.out.println(window);
		
		String title=driver.switchTo().window(window).getPageSource();
		
		System.out.println(title);
		driver.quit();
		
		
	}

}
