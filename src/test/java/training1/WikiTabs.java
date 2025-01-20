package training1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiTabs {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Vijay");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> AllLinks = driver.findElements(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a"));
		
		for(WebElement x:AllLinks)
		{
			System.out.println(x.getAttribute("href"));
		}

	}

}
