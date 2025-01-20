package training1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		
		System.out.println(row.size());
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		
		System.out.println(col.size());
		
		driver.navigate().to("https://www.google.co.in/");
	}

}
